package com.radik.spring_course.lesson10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)) {
            University university = context.getBean("university", University.class);
            university.addStudents();
            try {
                System.out.println(university.getStudents());
            } catch (Exception e) {
                System.out.println("Поймано исключение - " + e);
            }
        }
    }
}
