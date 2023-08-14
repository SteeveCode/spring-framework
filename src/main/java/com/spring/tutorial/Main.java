package com.spring.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        printHeading();

        var di = new AnnotationConfigApplicationContext("com.spring.tutorial");
        var car = di.getBean(Car.class);
        car.start();
        System.out.println("Car Instance: " + car);

        printBeanDefinitions(di);

    }
    private static void printHeading(){
        System.out.println("***************Spring Application**************************");
    }
    private static void printBeanDefinitions(AnnotationConfigApplicationContext di){
    }
}
