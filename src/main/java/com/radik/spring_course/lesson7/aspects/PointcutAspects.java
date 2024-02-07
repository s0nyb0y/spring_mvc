package com.radik.spring_course.lesson7.aspects;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class PointcutAspects {
    @Pointcut("execution(* get*())")
    private void getAllMethods(){}
    @Pointcut("execution(* com.radik.spring_course.lesson7.SchoolLibrary.getBook())")
    private void getSchoolLibraryMethod(){}
    @Pointcut("getAllMethods() && !getSchoolLibraryMethod()")
    public void getAllMethodsExceptSchoolLibrary(){}
    @Pointcut("execution(* add*(com.radik.spring_course.lesson7.Book))")
    public void allAddMethods(){}
}
