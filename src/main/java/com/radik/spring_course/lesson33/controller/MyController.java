package com.radik.spring_course.lesson33.controller;

import com.radik.spring_course.lesson33.entity.Employee;
import com.radik.spring_course.lesson33.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    private final EmployeeService employeeService;

    @Autowired
    public MyController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/")
    public String getAllEmployees(Model model) {
        List<Employee> allEmployee = employeeService.getAllEmployee();
                model.addAttribute("allEmps", allEmployee);
        return "all-employees2";
    }
    @RequestMapping("/add_new_employee")
    public String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "employee-info";
    }
    @RequestMapping("/save_employee")
    public String saveEmployee(@ModelAttribute("employee")Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:/";
    }
}
