"""
 *
 * This file is part of rasdaman community.
 *
 * Rasdaman community is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Rasdaman community is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU  General Public License for more details.
 *
 * You should have received a copy of the GNU  General Public License
 * along with rasdaman community.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2003 - 2015 Peter Baumann / rasdaman GmbH.
 *
 * For more information please see <http://www.rasdaman.org>
 * or contact Peter Baumann via <baumann@rasdaman.com>.
 *
"""
import math
import decimal

from lib import arrow
from master.error.runtime_exception import RuntimeException
from master.evaluator.evaluator_slice import NetcdfEvaluatorSlice
from master.evaluator.sentence_evaluator import SentenceEvaluator
from master.extra_metadata.extra_metadata_collector import ExtraMetadataCollector, ExtraMetadataEntry
from master.extra_metadata.extra_metadata_ingredient_information import ExtraMetadataIngredientInformation
from master.extra_metadata.extra_metadata_serializers import ExtraMetadataSerializerFactory
from master.extra_metadata.extra_metadata_slice import ExtraMetadataSliceSubset
from master.generator.model.range_type_field import RangeTypeField
from master.generator.model.range_type_nill_value import RangeTypeNilValue
from master.helper.regular_user_axis import RegularUserAxis
from master.helper.user_axis import UserAxis, UserAxisType
from master.helper.user_band import UserBand
from master.importer.axis_subset import AxisSubset
from master.importer.coverage import Coverage
from master.importer.interval import Interval
from master.importer.slice import Slice
from master.provider.data.file_data_provider import FileDataProvider
from master.provider.metadata.coverage_axis import CoverageAxis
from master.provider.metadata.grid_axis import GridAxis
from master.provider.metadata.irregular_axis import IrregularAxis
from master.provider.metadata.regular_axis import RegularAxis
from recipes.general_coverage.abstract_to_coverage_converter import AbstractToCoverageConverter
from util.crs_util import CRSAxis, CRSUtil
from util.file_obj import File
from util.time_util import DateTimeUtil
from master.helper.high_pixel_adjuster import HighPixelAjuster


class NetcdfToCoverageConverter(AbstractToCoverageConverter):
    def __init__(self, sentence_evaluator, coverage_id, bands, nc_files, crs, user_axes, tiling, global_metadata_fields,
                 local_metadata_fields, metadata_type, grid_coverage):
        """
        Converts a netcdf list of files to a coverage
        :param SentenceEvaluator sentence_evaluator: the evaluator for wcst sentences
        :param str coverage_id: the id of the coverage
        :param list[UserBand] bands: the name of the coverage band
        :param list[File] nc_files: a list of grib files
        :param str crs: the crs of the coverage
        :param list[UserAxis] user_axes: a list with user axes
        :param str tiling: the tiling string to be passed to wcst
        :param dict global_metadata_fields: the global metadata fields
        :param dict local_metadata_fields: the local metadata fields
        :param str metadata_type: the metadata type
        :param boolean grid_coverage: check if user want to import as grid coverage
        """
        AbstractToCoverageConverter.__init__(self, sentence_evaluator)
        self.sentence_evaluator = sentence_evaluator
        self.coverage_id = coverage_id
        self.bands = bands
        self.nc_files = nc_files
        self.crs = crs
        self.user_axes = user_axes
        self.tiling = tiling
        self.global_metadata_fields = global_metadata_fields
        self.local_metadata_fields = local_metadata_fields
        self.metadata_type = metadata_type
        self.grid_coverage = grid_coverage

    def _get_null_value(self):
        """
        Returns the null value for this file
        :rtype: list[RangeTypeNilValue]
        """
        if len(self.bands) < 0:
            raise RuntimeException("At least one band should be provided.")
        band = self.bands[0]
        valid_user_nill = band.nilValues is not None and len(band.nilValues) > 0 and band.nilValues[0] != ''
        null_value = band.nilValues if valid_user_nill else self._null_value()
        if null_value is not None:
            range_nils = [RangeTypeNilValue("", null_value)]
            return range_nils
        return None

    def _metadata(self, slices):
        """
        Returns the metadata in the corresponding format indicated in the converter
        :param list[Slice] slices: the slices of the coverage
        :rtype: str
        """
        if not self.local_metadata_fields and not self.global_metadata_fields:
            return ""
        serializer = ExtraMetadataSerializerFactory.get_serializer(self.metadata_type)
        metadata_entries = []
        for coverage_slice in slices:
            slice = NetcdfEvaluatorSlice(coverage_slice.data_provider.file)
            metadata_entry_subsets = []
            for axis in coverage_slice.axis_subsets:
                metadata_entry_subsets.append(ExtraMetadataSliceSubset(axis.coverage_axis.axis.label, axis.interval))
            metadata_entries.append(ExtraMetadataEntry(slice, metadata_entry_subsets))

        collector = ExtraMetadataCollector(self.sentence_evaluator,
                                           ExtraMetadataIngredientInformation(self.global_metadata_fields,
                                                                              self.local_metadata_fields),
                                           metadata_entries)
        return serializer.serialize(collector.collect())

    def _get_user_axis_by_crs_axis_name(self, crs_axis_name):
        """
        Returns the user axis corresponding to
        :param crs_axis_name: the name of the crs axis to retrieve
        :rtype: UserAxis
        """
        for user_axis in self.user_axes:
            if user_axis.name == crs_axis_name:
                return user_axis

    def _axis_subset(self, crs_axis, nc_file):
        """
        Returns an axis subset using the given crs axis in the context of the nc file
        :param crs_axis:
        :param nc_file:
        :return:
        """
        user_axis = self._user_axis(self._get_user_axis_by_crs_axis_name(crs_axis.label), NetcdfEvaluatorSlice(nc_file))
        high = user_axis.interval.high if user_axis.interval.high else user_axis.interval.low

        # if low < high, adjust it (used when latitude axis in netCDF is reversed)
        if user_axis.interval.high is not None and user_axis.interval.low > user_axis.interval.high:
            user_axis.interval.low, user_axis.interval.high = user_axis.interval.high, user_axis.interval.low
            high = user_axis.interval.high

        if isinstance(user_axis, RegularUserAxis):
            geo_axis = RegularAxis(crs_axis.label, crs_axis.uom, user_axis.interval.low, high, user_axis.interval.low,
                                   crs_axis)
        else:
            geo_axis = IrregularAxis(crs_axis.label, crs_axis.uom, user_axis.interval.low, high, user_axis.interval.low,
                                     [0], crs_axis)

        if user_axis.type == UserAxisType.DATE:
            grid_low = 0
            # convert all the time_low, time_high, resolution from datetime (date) to seconds
            time_low = arrow.get(user_axis.interval.low).timestamp
            time_high = arrow.get(high).timestamp
            number_of_timepixels = time_high - time_low

            # AnsiDate
            if crs_axis.is_uom_day:
                resolution = user_axis.resolution * DateTimeUtil.DAY_IN_SECONDS

            grid_high = abs(decimal.Decimal(str(grid_low))
                            + decimal.Decimal(str(number_of_timepixels)) / decimal.Decimal(str(resolution)))
            grid_high = HighPixelAjuster.adjust_high(grid_high)

            # As Time is always point to future (min -> max)
            grid_high = abs(math.ceil(grid_high))

        else:
            grid_low = 0
            if user_axis.interval.high is not None:
                number_of_geopixels = decimal.Decimal(str(user_axis.interval.high)) \
                                    - decimal.Decimal(str(user_axis.interval.low))
            else:
                # when dataBound is set to false, it is slicing subset
                if user_axis.interval.high is None:
                    number_of_geopixels = decimal.Decimal(1)
                else:
                    number_of_geopixels = decimal.Decimal(str(user_axis.interval.high))\
                                        - decimal.Decimal(str(user_axis.interval.low))

            grid_high = abs(decimal.Decimal(str(grid_low))
                            + decimal.Decimal(str(number_of_geopixels)) / decimal.Decimal(str(user_axis.resolution)))
            grid_high = HighPixelAjuster.adjust_high(grid_high)

            # Negative axis (e.g: Latitude), min <-- max
            if user_axis.resolution < 0:
                grid_high = int(math.floor(grid_high))
            else:
                # Positive axis (e.g: Longitude), min ---> max
                grid_high = int(math.ceil(grid_high))

            # NOTE: Grid Coverage uses the direct intervals as in Rasdaman, modify the high bound will have error in petascope
            if not self.grid_coverage:
                if grid_high > grid_low:
                    grid_high -= 1

        grid_axis = GridAxis(user_axis.order, crs_axis.label, user_axis.resolution, grid_low, grid_high)

        if crs_axis.is_easting():
            # NOTE: longitude axis origin always point from the left -> right
            geo_axis.origin = decimal.Decimal(str(geo_axis.low)) \
                            + decimal.Decimal(str(user_axis.resolution)) / 2
        elif crs_axis.is_northing():
            # NOTE: latitude axis origin always point from the right -> left
            geo_axis.origin = decimal.Decimal(str(geo_axis.high)) \
                            + decimal.Decimal(str(user_axis.resolution)) / 2
        elif crs_axis.is_future():
            # When it is DateTime format, it needs to be quoted, e.g: "2006-01-01T01:01:03Z"
            if user_axis.type == UserAxisType.DATE:
                geo_axis.origin = DateTimeUtil.get_datetime_iso(geo_axis.origin)
                geo_axis.low = DateTimeUtil.get_datetime_iso(geo_axis.low)

                if geo_axis.high is not None:
                    geo_axis.high = DateTimeUtil.get_datetime_iso(geo_axis.high)

                user_axis.interval.low = DateTimeUtil.get_datetime_iso(user_axis.interval.low)
                if user_axis.interval.high is not None:
                    user_axis.interval.high = DateTimeUtil.get_datetime_iso(user_axis.interval.high)

        return AxisSubset(CoverageAxis(geo_axis, grid_axis, user_axis.dataBound),
                          Interval(user_axis.interval.low, user_axis.interval.high))

    def _slice(self, nc_file, crs_axes):
        """
        Returns a slice for a netcdf file
        :param File nc_file: the path to the netcdf file
        :param list[CRSAxis] crs_axes: the crs axes for the coverage
        :rtype: Slice
        """
        axis_subsets = []
        file_structure = self._file_structure()
        for i in range(0, len(crs_axes)):
            axis_subsets.append(self._axis_subset(crs_axes[i], nc_file))

        return Slice(axis_subsets, FileDataProvider(nc_file, file_structure))

    def _file_structure(self):
        """
        Returns the file structure
        :rtype: dict
        """
        file_structure = {}
        variables = []
        for band in self.bands:
            if band.identifier is not None:
                variables.append(str(band.identifier))
        if len(variables) > 0:
            file_structure["variables"] = variables
        return file_structure

    def _slices(self, crs_axes):
        """
        Returns all the slices for this coverage
        :param crs_axes:
        :rtype: list[Slice]
        """
        slices = []
        for nc_file in self.nc_files:
            slices.append(self._slice(nc_file, crs_axes))
        return slices

    def _range_fields(self):
        """
        Returns the range fields for the coverage
        :rtype: list[RangeTypeField]
        """
        range_fields = []
        for band in self.bands:
            range_nills = self._get_null_value()
            if range_nills is None and band.nilValues is not None:
                range_nills = []
                for nil_value in band.nilValues:
                    range_nills.append(RangeTypeNilValue("", nil_value))
            range_fields.append(
                RangeTypeField(band.name, band.definition, band.description, range_nills, band.uomCode))
        return range_fields

    def _data_type(self):
        """
        Returns the data type for this netcdf dataset
        :rtype: str
        """
        if len(self.nc_files) < 1:
            raise RuntimeException("No netcdf files given for import!")
        import netCDF4
        nci = netCDF4.Dataset(self.nc_files[0].get_filepath(), 'r')
        return self.netcdf_type_to_gdal_type(nci.variables[self.bands[0].identifier].dtype.name)

    def _null_value(self):
        """
        Returns the null value from the given dataset if one exists, None otherwise
        :rtype:
        """
        if len(self.nc_files) < 1:
            raise RuntimeException("No netcdf files given for import!")
        try:
            import netCDF4
            nci = netCDF4.Dataset(self.nc_files[0].get_filepath(), 'r')
            return nci.variables[self.bands[0].identifier]._FillValue
        except:
            return None

    def netcdf_type_to_gdal_type(self, type):
        """
        In WCST we use the gdal data types, so we need a transformation from numpy netcdf types
        :param str type: the numpy type
        :rtype: str
        """
        numpy_to_gdal_dict = {
            "uint8": 1,
            "int8": 1,
            "uint16": 2,
            "int16": 3,
            "uint32": 4,
            "int32": 5,
            "float32": 6,
            "float64": 7,
            "complex64": 10,
            "complex128": 11,
        }
        import gdal
        return gdal.GetDataTypeName(numpy_to_gdal_dict[type])

    def to_coverage(self):
        """
        Returns the grib files as a coverage
        :rtype: Coverage
        """
        crs_axes = CRSUtil(self.crs).get_axes()
        slices = self._slices(crs_axes)
        coverage = Coverage(self.coverage_id, slices, self._range_fields(), self.crs,
                            self._data_type(),
                            self.tiling, self._metadata(slices))
        return coverage


