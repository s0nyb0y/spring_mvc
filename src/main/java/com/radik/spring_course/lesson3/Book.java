package com.radik.spring_course.lesson3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:myApp.properties")
public class Book {
    @Value("${book.name}")
    private String name;

    public String getName() {
        return name;
    }
}
