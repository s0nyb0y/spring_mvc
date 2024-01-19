package com.radik.spring_course.lesson2_aop;

import com.radik.spring_course.lesson2_aop.aspects.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Попытка взять книгу из UniLibrary");
    }
    public void returnBook(){
        System.out.println("Попытка вернуть книгу в UniLibrary");
    }
}
