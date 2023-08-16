package com.spring.tutorial;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.inject.Named;

@Component
// @ManagedBean
//@Qualifier("engine")
//@Fuel(fuelType = Fuel.FuelType.Gasoline, capacity = 10)
//@Named("engine")
public class Engine {
}
