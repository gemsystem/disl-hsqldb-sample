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
package org.disl.sample.dataModel.common

import org.disl.sample.dataModel.domains.UpdatedTimestamp
import org.disl.sample.pattern.DeployTargetTable
import org.disl.util.test.AbstractDislTestCase
import org.junit.Before
import org.junit.Test

abstract class TargetTable extends AbstractTable {

	DeployTargetTable pattern
	
	UpdatedTimestamp UPDATED_TIMESTAMP
	
}
