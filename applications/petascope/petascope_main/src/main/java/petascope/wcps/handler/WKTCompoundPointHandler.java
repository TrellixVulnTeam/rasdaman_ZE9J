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
package petascope.wcps.handler;

import java.util.Arrays;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import petascope.exceptions.PetascopeException;
import petascope.wcps.result.VisitorResult;
import petascope.wcps.result.WcpsResult;
import petascope.wcps.subset_axis.model.WKTCompoundPoint;

/**
// Handle wktPoints (coordinates inside WKT): constant (constant)*) (COMMA constant (constant)*)*
// e.g: 20 30 "2017-01-01T02:35:50", 30 40 "2017-01-05T02:35:50", 50 60 "2017-01-07T02:35:50" 
 * @author <a href="mailto:b.phamhuu@jacobs-university.de">Bang Pham Huu</a>
 */
@Service
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class WKTCompoundPointHandler extends Handler {
    
    public WKTCompoundPointHandler() {
        
    }
    
    public WKTCompoundPointHandler create(Handler compoundPointHandler, Handler numberOfDimensionsStringHandler) {
        WKTCompoundPointHandler result = new WKTCompoundPointHandler();
        result.setChildren(Arrays.asList(compoundPointHandler, numberOfDimensionsStringHandler));
        return result;
    }
    
    @Override
    public VisitorResult handle() throws PetascopeException {
        WcpsResult compoundPointsResult = (WcpsResult) this.getFirstChild().handle();
        WcpsResult numberOfDimensionsStringHandler = (WcpsResult) this.getSecondChild().handle();
        
        String compoundPoints = compoundPointsResult.getRasql();
        int numberOfDimensions = Integer.parseInt(numberOfDimensionsStringHandler.getRasql());
        
        WKTCompoundPoint result = new WKTCompoundPoint(compoundPoints, numberOfDimensions);
        return result;
    }
}