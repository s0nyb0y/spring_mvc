package com.radik.spring_course.lesson11;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("Мы берём книгу из SchoolLibrary");
    }
}
