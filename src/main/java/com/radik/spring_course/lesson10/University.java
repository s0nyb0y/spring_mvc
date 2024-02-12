package com.radik.spring_course.lesson10;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class University {
    List<Student> students = new ArrayList<>();
    public void addStudents(){
        Collections.addAll(students,new Student("Zaur Tregulov",4,7.0),
                new Student("Mikhail Ivanov",2,8.5),
                new Student("Elena Sidorova",1,9.5));
    }
    public List<Student>getStudents(){
        System.out.println(students.get(3));
        System.out.println("Information from students: \n" + students);
        return students;
    }
}
