package com.radik.spring_course.lesson2_aop.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {
    @Before("execution(* *getBook())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: попытка взять книгу");
    }
    @AfterReturning("execution(* *returnBook())")
    public void afterReturnBook(){
        System.out.println("afterReturnBook: попытка вернуть книгу");
    }
}
