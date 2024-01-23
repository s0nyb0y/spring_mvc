package com.radik.spring_course.lesson4;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {
    public void getBook(){
        System.out.println("Попытка взять книгу из UniLibrary");
    }
    public void getMagazine(){
        System.out.println("Попытка взять журнал из UniLibrary");
    }
}
