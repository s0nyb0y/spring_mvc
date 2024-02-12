package com.radik.spring_course.lesson11.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Around("execution(* returnBook())")
    public Object aroundGetAllMethodsLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundGetAllMethodsLoggingAdvice: Попытка вернуть книгу");
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("aroundGetAllMethodsLoggingAdvice: Возвращение книги");
        return targetMethodResult;
    }
}
