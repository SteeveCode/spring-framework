package com.spring.tutorial;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Component // gives the @Vehicle annotation the ability to function as @Component (aka meta annotation)
@Target(ElementType.TYPE) // on top of what should annotation be placed(e.g. class, methods etc)
@Retention(RetentionPolicy.RUNTIME) // do not remove annotation at runtime. keep it.
public @interface Vehicle {

    @AliasFor(attribute = "value", annotation = Component.class)
    String value() default "";
}
