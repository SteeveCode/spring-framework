package com.spring.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        printHeading();

        var di = new AnnotationConfigApplicationContext("com.spring.tutorial");
        var car = di.getBean(Car.class);
        System.out.println("Car Instance: " + car);
        System.out.println("Bean Definition: ");
        System.out.println("Name: ");
        System.out.println("Type: ");

        printBeanDefinitions(di);

    }
    private static void printHeading(){
        System.out.println("##################Bean Definitions: #####################");
    }
    private static void printBeanDefinitions(AnnotationConfigApplicationContext di){
    }
}
