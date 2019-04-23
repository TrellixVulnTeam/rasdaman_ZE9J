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
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with rasdaman community.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2003 - 2017 Peter Baumann /
 rasdaman GmbH.
 *
 * For more information please see <http://www.rasdaman.org>
 * or contact Peter Baumann via <baumann@rasdaman.com>.
 */

///<reference path="../../../common/_common.ts"/>
///<reference path="../ows/ows_all.ts"/>
///<reference path="CoverageSummary.ts"/>
///<reference path="Extension.ts"/>

module wcs {
    export class Contents extends ows.ContentsBase {
        public coverageSummaries:CoverageSummary[];
        public extension:Extension;

        public constructor(source:rasdaman.common.ISerializedObject) {
            super(source);

            rasdaman.common.ArgumentValidator.isNotNull(source, "source");

            this.coverageSummaries = [];
            source.getChildrenAsSerializedObjects("wcs:CoverageSummary").forEach(o => {
                this.coverageSummaries.push(new CoverageSummary(o));
            });

            if (source.doesElementExist("wcs.Extension")) {
                this.extension = new Extension(source.getChildAsSerializedObject("wcs.Extension"));
            }
        }
    }
}
