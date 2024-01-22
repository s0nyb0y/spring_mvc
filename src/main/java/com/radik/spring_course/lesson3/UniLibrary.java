package com.radik.spring_course.lesson3;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {
    public void getBook(Book book){
        System.out.println("Мы берём книгу " + book.getName() + " из UniLibrary");
    }
    public void getMagazine(){
        System.out.println("Мы берём журнал из UniLibrary");
    }
}
