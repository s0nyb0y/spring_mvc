package com.radik.spring_course.lesson2_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)){
            Library library = context.getBean("library", Library.class);
            library.getBook();
        }
    }
}
