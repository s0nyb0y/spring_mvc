package com.radik.spring_course.lesson3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)){
            UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
            Book book = context.getBean("book", Book.class);
            uniLibrary.getBook(book);
            uniLibrary.getMagazine();
        }
    }
}
