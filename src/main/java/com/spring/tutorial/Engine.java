package com.spring.tutorial;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.inject.Named;

@Component
// @ManagedBean
//@Qualifier("engine")
//@Fuel(fuelType = Fuel.FuelType.Gasoline, capacity = 10)
//@Named("engine")
@Profile({"test", "dev"}) // logical operators can be used inside the array
public class Engine {
}
