package com.radik.spring_course.lesson2_aop;

import org.springframework.stereotype.Component;

@Component
public class Library {
    public void getBook(){
        System.out.println("Мы взяли книгу");
    }
}
