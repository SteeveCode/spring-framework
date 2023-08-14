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
    public Car(GearBox gearBox){
        System.out.println("Car is being instantiated with gearBox");
        this.gearBox = gearBox;
        this.engine = new Engine();
    };
    @Autowired(required = false)
    public Car(Engine engine){
        System.out.println("Car is being instantiated with engine");
        this.gearBox = new GearBox();
        this.engine = engine;
    };
    @Autowired(required = false)
    public Car(GearBox gearBox, Engine engine){
        System.out.println("Car is being instantiated with gearBox and engine");
        this.gearBox = new GearBox();
        this.engine = new Engine();
    };
    public void start(){
        engine.ignite();
        gearBox.gearUp();
    }
}
