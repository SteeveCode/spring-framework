package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

@Component
// @ManagedBean
//@Qualifier("superEngine")
//@Named("superEngine")
@DependsOn("car")
public class SuperEngine extends Engine{
    @PostConstruct
    public void init()throws Exception{
        System.out.println("after properties are set inside super engine ");
    }

    @PreDestroy
    public void close()throws Exception{
        System.out.println("destroying super engine ");
    }

}
