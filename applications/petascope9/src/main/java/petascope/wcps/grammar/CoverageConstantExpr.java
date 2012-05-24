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
 * Copyright 2003 - 2010 Peter Baumann / rasdaman GmbH.
 *
 * For more information please see <http://www.rasdaman.org>
 * or contact Peter Baumann via <baumann@rasdaman.com>.
 */
package petascope.wcps.grammar;

import petascope.util.WCPSConstants;

/**
 * CoverageConstantExpr
 *
 * @author Andrei Aiordachioaie
 */
public class CoverageConstantExpr implements IParseTreeNode {

    AxisIteratorList alist;
    ConstantList clist;
    String name;

    public CoverageConstantExpr(String name, AxisIteratorList alist, ConstantList clist) {
        this.name = name;
        this.alist = alist;
        alist.setTag(WCPSConstants.MSG_AXIS_ITERATOR);
        this.clist = clist;
    }

    public String toXML() {
        String result = "";

        result += "<" + WCPSConstants.MSG_NAME + ">" + name + "</" + WCPSConstants.MSG_NAME + ">";
        result += alist.toXML();
        result += clist.toXML();

        result = "<" + WCPSConstants.MSG_CONST + ">" + result + "</" + WCPSConstants.MSG_CONST + ">";
        return result;
    }
}
