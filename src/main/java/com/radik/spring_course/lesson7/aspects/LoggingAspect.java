package com.radik.spring_course.lesson7.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("com.radik.spring_course.lesson7.aspects.PointcutAspects.getAllMethodsExceptSchoolLibrary()")
    public void beforeGetBookLoggingAdvice(){
        System.out.println("beforeGetBookLoggingAdvice: попытка взять книгу");
    }
    @Before("com.radik.spring_course.lesson7.aspects.PointcutAspects.allAddMethods()")
    public void beforeAllAddMethods(JoinPoint joinPoint){
        System.out.println("beforeAllAddMethods: попытка добавить книгу");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature.getReturnType());
    }
}
