package com.radik.spring_course.lesson6;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {
    public void getBook(){
        System.out.println("Мы берём книгу из UniLibrary");
    }
}
