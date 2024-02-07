package com.radik.spring_course.lesson7;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary");
    }
    public void addBook(String name){
        System.out.println(name + " добавляет книгу в UniLibrary");
    }
}
