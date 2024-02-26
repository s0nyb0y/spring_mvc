package com.radik.spring_course.lesson20.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String departmentName;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "min_salary")
    private int minSalary;
    @OneToMany(cascade = CascadeType.ALL
            ,mappedBy = "departments"
            ,fetch = FetchType.LAZY)
    private List<Employee>empList;
    public Departments() {
    }

    public Departments(String departmentName, int maxSalary, int minSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }
    public void addEmployeeToDepartment(Employee employee){
        if (empList == null){
            empList = new ArrayList<>();
        }
        empList.add(employee);
        employee.setDepartments(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +
                '}';
    }
}
