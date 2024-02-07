package com.radik.spring_course.lesson7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Ф.М.Достоевский")
    private String author;
    @Value("Преступление и наказание")
    private String name;
    @Value("1886")
    private int yearOfPublishing;

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
}
