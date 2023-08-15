package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("superb")
@Fuel(fuelType = Fuel.FuelType.Electricity, capacity = 20)
public class SuperEngine extends Engine{
}
