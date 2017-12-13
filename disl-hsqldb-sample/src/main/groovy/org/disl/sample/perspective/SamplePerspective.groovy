package org.disl.sample.perspective

import org.disl.meta.Perspective
import org.disl.pattern.Pattern
import org.disl.util.wiki.PerspectiveDataModelStep
import org.disl.util.wiki.PerspectiveWikiPageStep


abstract class SamplePerspective extends Perspective {

    SamplePerspectivePattern pattern=new SamplePerspectivePattern()

    class SamplePerspectivePattern extends Pattern {

        @Override
        void init() {
        }

        SamplePerspectivePattern() {
            add new PerspectiveDataModelStep(perspective: SamplePerspective.this)
            add new PerspectiveWikiPageStep(perspective: SamplePerspective.this)
        }
    }
}
