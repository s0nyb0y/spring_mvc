package com.radik.spring_course.lesson33.service;

import com.radik.spring_course.lesson33.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployee();

    void addEmployee(Employee employee);
}
