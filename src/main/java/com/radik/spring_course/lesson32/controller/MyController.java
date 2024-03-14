package com.radik.spring_course.lesson32.controller;

import com.radik.spring_course.lesson32.dao.EmployeeDAO;
import com.radik.spring_course.lesson32.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class MyController {
    private final EmployeeDAO employeeDAO;

    @Autowired
    public MyController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee>allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("allEmps",allEmployees);
        return "all-employees";
    }
}
