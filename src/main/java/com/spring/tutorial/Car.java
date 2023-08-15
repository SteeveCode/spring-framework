package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
*If the injection point is not annotated with @Qualifier, it will ignore all @Qualifier placed at the class level
* and will not try to use the qualifier name to resolve a conflict
* */

@Component
public class Car {
    @Autowired
//    @Qualifier("engine")
//    @Fuel(fuelType = Fuel.FuelType.Gasoline, capacity = 10)
    @Fuel(fuelType = Fuel.FuelType.Electricity, capacity = 20)

    private Engine s; // injection point

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + s +
                '}';
    }
}
