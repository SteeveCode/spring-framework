package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
@Component
@Scope("singleton")
//@Scope("prototype")
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
