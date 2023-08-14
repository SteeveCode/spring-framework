package com.spring.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        printHeading();

        var di = new AnnotationConfigApplicationContext("com.spring.tutorial");
        for(String name:di.getBeanDefinitionNames()){
            if(!name.contains("org.springframework")){
                var beanDef = di.getBeanDefinition(name);
                System.out.println("Bean: " + name + " has type of "+ beanDef.getBeanClassName());
            }
        }
        var car = di.getBean(Car.class);
        System.out.println("Car Instance: " + car);

        printBeanDefinitions(di);

    }
    private static void printHeading(){
        System.out.println("***************Spring Application**************************");
    }
    private static void printBeanDefinitions(AnnotationConfigApplicationContext di){
    }
}
