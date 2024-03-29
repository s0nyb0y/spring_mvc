package com.radik.spring_course.lesson28;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String surname;
    private String department;
    private int salary;
    private String carBrand;
    private String[] languages;
    private Map<String,String>departments = new HashMap<>();
    private Map<String,String>carBrands = new HashMap<>();
    {
        departments.put("Information Technology","IT");
        departments.put("Human Resources","HR");
        departments.put("Sales","Sales");

        carBrands.put("BMW","BMW");
        carBrands.put("AUDI","AUDI");
        carBrands.put("SKODA","SKODA");
    }

    public Employee() {
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
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
