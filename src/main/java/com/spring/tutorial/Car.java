package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("the Car")
public class Car {
    private GearBox gearBox;
    private Engine engine;
    public Car(){
        System.out.println("Car is being instantiated with nothing");
        this.gearBox = new GearBox();
        this.engine = new Engine();
    }
    @Autowired(required = false)
    public void setGearBox(GearBox gearBox, Engine engine){
        System.out.println("Setting gearBox and Engine");
        this.gearBox = gearBox;
    }
    @Autowired(required = false)
    public void giveMeMyDependencies(GearBox gearBox, Engine engine){
        System.out.println("Setting gearBox and Engine");
        this.gearBox = gearBox;
    }

    public void start(){
        engine.ignite();
        gearBox.gearUp();
    }
}
