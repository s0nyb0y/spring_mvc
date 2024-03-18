package com.radik.spring_course.lesson34.controller;

import com.radik.spring_course.lesson34.entity.Employee;
import com.radik.spring_course.lesson34.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        List<Employee>allEmployees = employeeService.getAllEmployee();
        model.addAttribute("allEmps",allEmployees);
        return "all-employees3";
    }

    @RequestMapping("/add_new_employee2")
    public String addNewEmployees(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "employee-info2";
    }

    @RequestMapping("/save_employee2")
    public String saveEmployee(@ModelAttribute("employee")Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }
    @RequestMapping("/update_info")
    public String updateEmployee(@RequestParam("empId")int id,Model model){
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee",employee);
        return "employee-info2";
    }
}
