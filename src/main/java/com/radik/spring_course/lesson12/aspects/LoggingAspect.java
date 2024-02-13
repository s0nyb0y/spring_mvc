package com.radik.spring_course.lesson12.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(* getBook())")
    public void beforeGetMethodsAdvice(){
        System.out.println("beforeGetMethodsAdvice: Попытка взять книгу");
    }
    @Around("execution(* returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: попытка вернуть книгу");
        Object targetMethodAdvice;
        try {
            targetMethodAdvice = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("Ловим исключение - " + e);
            throw e;
        }
        System.out.println("aroundReturnBookLoggingAdvice: возвращение книги");
        return targetMethodAdvice;
    }
}
