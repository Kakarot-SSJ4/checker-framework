package org.checkerframework.framework.qual;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Declaration annotation applied to type declarations to specify the qualifier to be added to
 * unannotated uses of the type.
 */
@Target(ElementType.TYPE)
public @interface DefaultQualifierForUse {
    /** Qualifier to add to all unannotated uses of the type with this declaration annotation. */
    Class<? extends Annotation>[] value() default {};
}
