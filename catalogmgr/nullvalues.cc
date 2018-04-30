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
* Copyright 2003, 2004, 2005, 2006, 2007, 2008, 2009 Peter Baumann /
rasdaman GmbH.
*
* For more information please see <http://www.rasdaman.org>
* or contact Peter Baumann via <baumann@rasdaman.com>.
*/
/**
  * INCLUDE: nullvalues.hh
 *
 * MODULE:  rasodmg
 * CLASS:   NullValuesHandler
 *
 * COMMENTS:
 *      None
*/

#include "nullvalues.hh"
#include "debug/debug-srv.hh"
#include <logging.hh>

NullValuesHandler::NullValuesHandler()
    : nullValues(NULL), nullValuesCount(0)
{
}

NullValuesHandler::NullValuesHandler(r_Minterval* newNullValues)
    : nullValues(newNullValues), nullValuesCount(0)
{
}

NullValuesHandler::~NullValuesHandler()
{
}

r_Minterval*
NullValuesHandler::getNullValues() const
{
    if (nullValues != NULL)
    {
        LDEBUG << "returning null values " << nullValues->to_string();
    }
    return nullValues;
}

r_Range 
NullValuesHandler::getNullValue() const
{
    if (nullValues != NULL)
    {
        // picks the first fixed value found in the r_Minterval 
        // defining the range of nullValues
        for (auto i = 0; i < nullValues->dimension(); i++)
        {
            if((*nullValues)[i].is_low_fixed())
            {
                return (*nullValues)[i].low();
            }
            else if((*nullValues)[i].is_high_fixed())
            {
                return (*nullValues)[i].high();
            }
            else
            {
                // since we do not initialize nullValue above, we must throw 
                // an error in this case!
                LERROR << "Invalid null value specification (*:*)";
                throw r_Error(INTERVALOPEN);
            }
        }
    }
    return r_Range(0);
}

void
NullValuesHandler::setNullValues(r_Minterval* newNullValues)
{
    if (newNullValues != NULL)
    {
        LDEBUG << "setting to " << newNullValues->to_string();
    }
    nullValues = newNullValues;
}

unsigned long
NullValuesHandler::getNullValuesCount() const
{
    return nullValuesCount;
}

void
NullValuesHandler::setNullValuesCount(unsigned long count)
{
    nullValuesCount = count;
}



void
NullValuesHandler::cloneNullValues(const NullValuesHandler* obj)
{
    if (this != obj)
    {
        nullValues = obj->nullValues;
        nullValuesCount = obj->nullValuesCount;
    }
}
