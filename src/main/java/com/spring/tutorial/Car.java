package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("singleton")
//@Scope("prototype")
//@Lazy
public class Car implements AutoCloseable{
    @Autowired
    private Engine engine;

    public Car(Engine engine) {
        System.out.println("Car Constructor");
    }

    @PostConstruct
    public void init()throws Exception{
        System.out.println("After properties are set inside car "+ engine);
    }
    @Override
    public void close(){
        System.out.println("Destroying car ");
    }
//    @PreDestroy
//    public void close()throws Exception{
//        System.out.println("Destroying car ");
//    }

    @Override
    public String toString() {
        return "Car(" +hashCode() + "){ engine=" + engine + '}';
    }
}
