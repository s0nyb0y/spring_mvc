package com.radik.spring_course.lesson6.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class LoggingAspect {
    @Before("com.radik.spring_course.lesson6.aspects.MyPointcuts.allGetMethods()")
    public void beforeAllGetBook(){
        System.out.println("beforeAllGetBook: попытка взять книгу");
    }
}
