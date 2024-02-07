package com.radik.spring_course.lesson7;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("Мы берём книгу из SchoolLibrary ");
    }
    public void addBook(Book book){
        System.out.println("Мы добавляем книгу " + book.getName() + " автор " + book.getAuthor() + " "
                + book.getYearOfPublishing() + " года издания" + " в SchoolLibrary");
    }
}
