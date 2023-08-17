package com.spring.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        printHeading();

        var di = new AnnotationConfigApplicationContext();
        di.getEnvironment().setActiveProfiles("test");
        di.scan("com.spring.tutorial");
        di.refresh();

//        var car1 = di.getBean(Car.class);
//        System.out.println("Car Instance: " + car1);


        printBeanDefinitions(di);

    }
    private static void printHeading(){
        System.out.println("****************** Spring Application ***************************");
    }
    private static void printBeanDefinitions(AnnotationConfigApplicationContext di){
        System.out.println("\n\n################# Bean Definitions: #################################");
        for(String name : di.getBeanDefinitionNames()){
            if(name.contains("org.springframework"))
                continue;

            var beanDefinition = di.getBeanDefinition(name);
            var type = beanDefinition.getBeanClassName();

            System.out.println("Bean Definition: \n" +
                    "Name: " + name + "\n" +
                    "Type: " + type);
            System.out.println("\n==================================");

        }
    }
}
