package com.radik.spring_course.lesson7.aspects;

import com.radik.spring_course.lesson7.Book;
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

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj:arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - " + myBook.getName()
                            + ", год издания - " + myBook.getYearOfPublishing() + ", автор - " + myBook.getAuthor());
                } else if (obj instanceof String) {
                    System.out.println("Книгу добавил - " + obj);
                }
            }
        }
    }
}
