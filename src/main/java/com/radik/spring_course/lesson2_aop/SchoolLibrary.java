package com.radik.spring_course.lesson2_aop;

import com.radik.spring_course.lesson2_aop.aspects.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Попытка взять книгу из SchoolLibrary");
    }
}
