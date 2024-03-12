package com.radik.spring_course.lesson31;

import com.radik.spring_course.lesson31.validation.CheckEmail;
import jakarta.validation.constraints.*;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2,message = "не менее трёх символов")
    private String name;
    @NotBlank(message = "поле не может быть пустым")
    private String surname;
    private String department;
    @Min(value = 500,message = "не менее 499")
    @Max(value = 1500,message = "не более 1500")
    private int salary;
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{2}-\\d{2}",message = "формат номера - XXX-XXX-XX-XX")
    private String phoneNumber;
    private String[]languages;
    private String carBrand;
    @CheckEmail
    private String email;
    private Map<String,String>departments = new LinkedHashMap<>();
    {
        departments.put("Information Technology","IT");
        departments.put("Human Resources","HR");
        departments.put("Sales","Sales");
    }

    public Employee() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
                ", phoneNumber='" + phoneNumber + '\'' +
                ", languages=" + Arrays.toString(languages) +
                ", carBrand='" + carBrand + '\'' +
                ", departments=" + departments +
                '}';
    }
}
