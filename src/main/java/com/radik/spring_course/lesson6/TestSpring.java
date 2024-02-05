package com.radik.spring_course.lesson6;

import com.radik.spring_course.lesson6.aspects.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)){
            UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
            uniLibrary.getBook();
            SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
            schoolLibrary.getBook();
        }
    }
}
