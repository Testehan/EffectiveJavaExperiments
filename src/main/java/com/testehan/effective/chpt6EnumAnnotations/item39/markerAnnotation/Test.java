package com.testehan.effective.chpt6EnumAnnotations.item39.markerAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
     The declaration for the Test annotation type is itself annotated with
     Retention and Target annotations. Such annotations on annotation type declarations are known as meta-annotations.
     The @Retention(RetentionPolicy.RUNTIME) meta-annotation indicates that Test annotations should be retained at
     runtime. Without it, Test annotations would be invisible to the test tool. The @Target.get(ElementType.METHOD)
     meta-annotation indicates that the Test annotation is legal only on method declarations: it cannot be applied to class
     declarations, field declarations, or  other program elements
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}
