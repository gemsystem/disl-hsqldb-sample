/*
 * Copyright 2015 Karel H�bl <karel.huebl@gmail.com>.
 *
 * This file is part of disl.
 *
 * Disl is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Disl is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Disl.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.disl.sample.scripts

import org.disl.sample.dataMapping.AllMappingsJobParallel
import org.disl.sample.dataMapping.AllMappingsJobSerial
import org.disl.sample.dataMapping.target.DepartmentMySubquery
import org.disl.sample.dataMapping.target.Load_R_EMPLOYEE
@BaseScript(org.disl.workflow.DislScript)
import groovy.transform.BaseScript

execute DepartmentMySubquery
execute Load_R_EMPLOYEE

//or:

execute AllMappingsJobSerial

//or:

execute AllMappingsJobParallel

//Results:

traceQueryData(Load_R_EMPLOYEE)