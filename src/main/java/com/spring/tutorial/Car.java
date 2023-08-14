package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("the Car")
public class Car {
//    @Autowired
    private GearBox gearBox;
    @Autowired(required = true)
    private Optional<Engine> engine;
    public Car(){
        System.out.println("Car is being instantiated with nothing");
        this.gearBox = null;
        this.engine = null;
    }
    @Autowired(required = false)
    public Car(Optional <Engine> engine, GearBox gearBox){
        System.out.println("'Car is being initialized with engine and gear box: " + engine);
    }
//    @Autowired(required = false)
//    public Car(@Nullable Engine engine, GearBox gearBox){
//        System.out.println("'Car is being initialized with engine and gear box: " + engine);
//    }
    @Autowired(required = false)
    public Car(Engine engine){

    }
    @Autowired(required = false)
    public Car(GearBox gearBox){

    }


    public void start(){
//        System.out.println("Starting with engine and gearbox " + engine);
//        engine.ignite();
//        gearBox.gearUp();
    }
}
