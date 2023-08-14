package com.spring.tutorial;

import org.springframework.stereotype.Component;

@Component
public class GearBox {
    public GearBox(){
        System.out.println("Gear Box Constructor");
    }
    public void gearUp(){};
}
