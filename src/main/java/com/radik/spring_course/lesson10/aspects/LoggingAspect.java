package com.radik.spring_course.lesson10.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetAllMethodsAdvice(){
        System.out.println("beforeGetAllMethodsAdvice: начало работы метода");
    }
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное завершение метода или ловим исключение");
    }
}
