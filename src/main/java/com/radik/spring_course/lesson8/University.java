package com.radik.spring_course.lesson8;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class University {
    private final List<Student> students = new ArrayList<>();
    public void addStudents(){
        Student st1 = new Student("Zaur Tregulov",4,7.5);
        Student st2 = new Student("Mikhail Ivanov",2,8.3);
        Student st3 = new Student("Elena Sidorova",1,9.1);

        Collections.addAll(students,st1,st2,st3);
    }
    public List<Student>getStudents(){
        System.out.println("Information from students\n" + students);
        return students;
    }
}
