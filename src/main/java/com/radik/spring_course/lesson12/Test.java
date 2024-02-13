package com.radik.spring_course.lesson12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)){
            UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
            uniLibrary.getBook();
            String bookName = uniLibrary.returnBook();
            System.out.println("Название книги - " + bookName);
        }
    }
}
