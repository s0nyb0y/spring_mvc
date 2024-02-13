package com.radik.spring_course.lesson12;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary");
    }
    public String returnBook(){
        int result = 10/0;
        System.out.println(result);
        return "Война и мир";
    }
}
