package com.radik.spring_course.lesson33.dao;

import com.radik.spring_course.lesson33.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee>getAllEmployee();

    void addEmployee(Employee employee);
}
