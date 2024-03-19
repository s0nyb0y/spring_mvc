package com.radik.spring_course.lesson35.controller;

import com.radik.spring_course.lesson35.entity.Employee;
import com.radik.spring_course.lesson35.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employee4";
    }

    @RequestMapping("/add_new_employee")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info3";
    }

    @RequestMapping("/save_employee")
    public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "employee-info3";
        } else {
            employeeService.saveOrUpdateEmployee(employee);
            return "redirect:/";
        }
    }

    @RequestMapping("/update_employee")
    public String updateEmployee(@RequestParam("empId") int id, Model model) {
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);
        return "employee-info3";
    }
    @RequestMapping("/delete_employee")
    public String deleteEmployee(@RequestParam("empId")int id){
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }
}
