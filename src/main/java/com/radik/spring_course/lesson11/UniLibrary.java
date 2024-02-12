package com.radik.spring_course.lesson11;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary");
    }
    public String returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "Война и мир";
    }
}
