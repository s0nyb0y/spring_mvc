package com.radik.spring_course.lesson34.service;

import com.radik.spring_course.lesson34.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployee();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);
}
