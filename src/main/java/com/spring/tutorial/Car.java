package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
//@Scope("prototype")
@Lazy
public class Car {
    @Autowired
    private Engine engine;

    public Car(Engine engine) {
        System.out.println("Car Constructor");    }

    @Override
    public String toString() {
        return "Car(" +hashCode() + "){ engine=" + engine + '}';
    }
}
