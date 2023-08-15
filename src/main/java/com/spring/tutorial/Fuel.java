package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The @Qualifier serves as a meta annotation that creates a custom mata-annotated composed annotation
 */

@Qualifier // Meta annotation
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.TYPE})
public @interface Fuel {
    public enum FuelType{
        Gasoline, Electricity
    }
    FuelType fuelType();
    int capacity();
}
