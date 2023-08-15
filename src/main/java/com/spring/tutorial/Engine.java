package com.spring.tutorial;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("engine")
@Fuel(fuelType = Fuel.FuelType.Gasoline, capacity = 10)
public class Engine {
}
