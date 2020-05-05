package com.example.annotation.annotationtest;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Format注解作用在字段上，针对时间字段类型的输出格式
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface Formats {
    String pattern() default "yyyy-MM-dd HH:mm:ss";
    String timezone() default "GMT+8";
}
