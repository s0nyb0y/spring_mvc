package com.radik.spring_course.lesson35.service;

import com.radik.spring_course.lesson35.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployees();

    void saveOrUpdateEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
