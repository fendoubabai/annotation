package com.example.annotation.annotationtest;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Labl表明当前字段输出的名称，仅作用在字段上
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface Label {
    String value() default "";
}
