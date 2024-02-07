package com.radik.spring_course.lesson7.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    @Before("com.radik.spring_course.lesson7.aspects.PointcutAspects.getAllMethodsExceptSchoolLibrary()")
    public void beforeGetBookSecurityAdvice(){
        System.out.println("beforeGetBookSecurityAdvice: проверка прав");
    }
    @Before("com.radik.spring_course.lesson7.aspects.PointcutAspects.allAddMethods()")
    public void beforeAddBookSecurityAdvice(){
        System.out.println("beforeAddBookSecurityAdvice: проверка прав");
    }
}
