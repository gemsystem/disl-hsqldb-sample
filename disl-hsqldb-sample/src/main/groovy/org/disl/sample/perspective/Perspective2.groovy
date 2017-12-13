package org.disl.sample.perspective

import org.disl.meta.Description
import org.disl.meta.Elements
import org.disl.meta.Name
import org.disl.meta.Tags
import org.disl.sample.dataMapping.target.Load_R_EMPLOYEE
import org.disl.sample.dataModel.source.DEPARTMENT
import org.disl.sample.dataModel.source.EMPLOYEE

@Name("Sample perspective 2")
@Tags(['Perspective1'])
@Elements([EMPLOYEE,Load_R_EMPLOYEE])
@Description("""\
Sample perspective 2
""")
class Perspective2 extends SamplePerspective{
}
