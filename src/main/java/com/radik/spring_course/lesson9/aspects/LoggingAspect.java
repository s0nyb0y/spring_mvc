package com.radik.spring_course.lesson9.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(* com.radik.spring_course.lesson9.University.getStudents())")
    public void beforeGetStudentsMethodAdvice() {
        System.out.println("beforeGetStudentsMethodAdvice: перед работай метода getStudents");
    }

    @AfterThrowing(pointcut = "execution(* com.radik.spring_course.lesson9.University.getStudents())",
            throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: ловим/правим исключения " + exception);
    }
}
