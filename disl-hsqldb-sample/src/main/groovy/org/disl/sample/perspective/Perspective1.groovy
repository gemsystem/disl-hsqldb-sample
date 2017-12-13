package org.disl.sample.perspective

import org.disl.meta.Description
import org.disl.meta.Elements
import org.disl.meta.Name
import org.disl.meta.Tags
import org.disl.sample.dataModel.source.DEPARTMENT
import org.disl.sample.dataModel.source.EMPLOYEE

@Name("Sample perspective 1")
@Tags(['Perspective1'])
@Elements([DEPARTMENT,EMPLOYEE])
@Description("""\
Sample perspective 1
""")
class Perspective1 extends SamplePerspective {}
