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
package petascope.wcst.helpers.update;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import petascope.exceptions.PetascopeException;
import petascope.util.ListUtil;

/**
 * Interface for updating rasdaman data.
 *
 * @author <a href="mailto:merticariu@rasdaman.com">Vlad Merticariu</a>
 */
public abstract class RasdamanUpdater {
    
    // Rasdaman user credentials
    protected String username;
    protected String password;

    /**
     * Updates rasdaman data.
     * @throws petascope.exceptions.PetascopeException
     */
    public abstract void updateWithFile() throws PetascopeException;
    
    /**
     * Instead of using the input file to update to rasdaman.
     * It will use the bytes of the file to update.
     */
    public abstract void updateWithBytes(byte bytes[]) throws PetascopeException;
    
    /**
     * Check if it needs to add shift() in Rasql query to update collection.
     * If input calculated shift domain contains only zeroes, e.g: [0,0,...0] 
     * then no need to shift() as decode(<[0:0] 1c> already produces this shift to [0,0,...0].
     */
    protected boolean needShiftDomain(String calculatedShiftDomain) {
        String patternStr = "\\[[0,]+\\]";
        
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(calculatedShiftDomain);
        if (matcher.find()) {
            // Only contains 0,0,...0
            return false;
        }
        
        return true;        
    }

    protected String translateToOrigin(String rasqlDomain) {
        // rasqlDomain, e.g. [3,0:18,0:35] with dataBound:false in the first axis
        // -> return [0:18,0:35] to be used for UPDATE collection with insitu
        // UPDATE coll SET coll[3,0:18,0:35] ASSIGN REFERENCING insitu("/home/rasdaman/test.tiff", "gdal", "{\"variables\":[\"Gray\"]}",[0:18,0:35])

        String[] dims = rasqlDomain.replace("[", "").replace("]", "").split(",");
        List<String> dimsTmp = new ArrayList<>();
        for (String dim: dims) {
            if(dim.contains(":")) {
                String[] parts = dim.split(":");
                int low = Integer.parseInt(parts[0].trim());
                int high = Integer.parseInt(parts[1].trim());
                String tmp = "0:" + String.valueOf(high - low);
                dimsTmp.add(tmp);
            }
        }
        
        String result = "[" + ListUtil.join(dimsTmp, ",") + "]";
        return result;
    }
}
