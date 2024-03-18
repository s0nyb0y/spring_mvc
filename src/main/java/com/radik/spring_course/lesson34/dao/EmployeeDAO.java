package com.radik.spring_course.lesson34.dao;

import com.radik.spring_course.lesson34.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee>getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);
}
