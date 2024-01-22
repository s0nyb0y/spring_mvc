package com.radik.spring_course.lesson3.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {
    @Before("execution(* *getBook(com.radik.spring_course.lesson3.Book))")
    public void beforeGetBookAdvice(){
        System.out.println("Попытка взять книгу");
    }
}
