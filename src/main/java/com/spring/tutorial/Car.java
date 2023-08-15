package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

@Component
public class Car {
    @Autowired
    private Engine e;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + e +
                '}';
    }
}
