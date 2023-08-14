package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("the Car")
public class Car {
    @Autowired
    private GearBox gearBox;
    @Autowired(required = true)
    private Engine engine;
    public Car(){
        System.out.println("Car is being instantiated with nothing");
        this.gearBox = null;
        this.engine = null;
    }


    public void start(){
        System.out.println("Starting with engine and gearbox " + engine);
        engine.ignite();
        gearBox.gearUp();
    }
}
