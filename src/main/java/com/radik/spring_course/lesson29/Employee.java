package com.radik.spring_course.lesson29;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "min 2 symbols")
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    private String department;
    private int salary;
    private String carBrand;
    private String [] languages;
    private Map<String,String>departments = new LinkedHashMap<>();
    {
        departments.put("Information Technology","IT");
        departments.put("Human Resources","HR");
        departments.put("Sales","Sales");
    }

    public Employee() {
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", departments=" + departments +
                '}';
    }
}
