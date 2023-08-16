package com.spring.tutorial;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.inject.Named;

@Component
// @ManagedBean
//@Qualifier("superEngine")
//@Named("superEngine")
public class SuperEngine extends Engine{
}
