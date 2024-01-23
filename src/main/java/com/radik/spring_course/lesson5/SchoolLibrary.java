package com.radik.spring_course.lesson5;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("Попытка взять книгу из SchoolLibrary");
    }
}
