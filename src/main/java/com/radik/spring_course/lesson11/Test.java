package com.radik.spring_course.lesson11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)) {
            UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
            String name = uniLibrary.returnBook();
            System.out.println("Название книги - " + name);
        }
    }
}
