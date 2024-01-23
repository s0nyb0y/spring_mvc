package com.radik.spring_course.lesson5.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAdvice {
    @Pointcut("execution(* get*())")
    public void allGetMethods(){}
    @Pointcut("execution(* return*())")
    public void allReturnMethods(){}
    @Pointcut("execution(* add*())")
    public void allAddMethods(){}
    @Pointcut("execution(* com.radik.spring_course.lesson5.SchoolLibrary.getBook())")
    public void getBookFromSchoolLibrary(){}
    @Pointcut("allGetMethods() && !getBookFromSchoolLibrary()")
    public void allGetMethodsExceptGetBoolSchoolLibrary(){}
    @Before("allGetMethodsExceptGetBoolSchoolLibrary()")
    public void getBookOrMagazine(){
        System.out.println("Попытка взять книгу/журнал");
    }
    @Before("allReturnMethods()")
    public void returnBookOrMagazine(){
        System.out.println("Попытка вернуть книгу/журнал");
    }
    @Before("allAddMethods()")
    public void addBookOrMagazine(){
        System.out.println("Попытка добавить книгу/журнал");
    }
}
