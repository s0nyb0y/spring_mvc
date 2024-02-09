package com.radik.spring_course.lesson9.aspects;

import com.radik.spring_course.lesson9.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)){
            University university = context.getBean("university", University.class);
            university.addStudent();
            try {
                university.getStudents();
            } catch (Exception e) {
                System.out.println("Поймали исключение - " + e);
            }
        }
    }
}
