/*
 * Copyright 2017 Anton�n Krotk� <antoninkrotky@gmail.com>.
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
package org.disl.sample.dataMapping.common

import org.disl.workflow.Job
import org.disl.workflow.ParallelJobReflectingDependencies
import org.junit.Test

abstract class AbstractParallelJob extends ParallelJobReflectingDependencies {

	@Test
	void testSimulate() {
		simulate()
	}
}
