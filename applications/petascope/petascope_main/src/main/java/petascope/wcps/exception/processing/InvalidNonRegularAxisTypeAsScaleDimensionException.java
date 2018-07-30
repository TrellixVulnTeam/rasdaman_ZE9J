/*
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
 * Copyright 2003 - 2018 Peter Baumann / rasdaman GmbH.
 *
 * For more information please see <http://www.rasdaman.org>
 * or contact Peter Baumann via <baumann@rasdaman.com>.
 */
package petascope.wcps.exception.processing;

import petascope.exceptions.WCPSException;
import petascope.exceptions.ExceptionCode;

/**
 * Error exception when scaling dimension is not regular, e.g: scale(coverage, {irregular_time})
 *
 * @author <a href="mailto:bphamhuu@jacobs-university.de">Bang Pham Huu</a>
 *
 */
public class InvalidNonRegularAxisTypeAsScaleDimensionException extends WCPSException {

    /**
     * Constructor for the class
     *
     * @param axisName
     * @param bound
     */
    public InvalidNonRegularAxisTypeAsScaleDimensionException(String axisName) {
        super(ExceptionCode.WcpsError, ERROR_TEMPLATE.replace("$axisName", axisName));
    }

    private static final String ERROR_TEMPLATE = "Scale operation is only supported on regular axis, given '$axisName' is irregular axis." ;
}
