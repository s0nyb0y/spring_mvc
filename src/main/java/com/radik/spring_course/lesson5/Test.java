package com.radik.spring_course.lesson5;

import com.radik.spring_course.lesson5.aspects.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)){
            UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
            uniLibrary.getBook();
            uniLibrary.getMagazine();
            SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
            schoolLibrary.getBook();
        }
    }
}
