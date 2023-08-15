package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.inject.Inject;

@Vehicle(value = "MyCar")
public class Car {
//    @Inject // same as @Autowired but has an always required attribute. Hence, use Optional type in order to allow null
//    private Engine enginee;

//    @Resource(name = "sup") // tries to resolve bean definition by its name, ID, or key and not ny type. bean name must be unique
//    private Object enginee;

    @Resource(name = "superEngine")
    private Engine engine;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
