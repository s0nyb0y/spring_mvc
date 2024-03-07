package com.radik.spring_course.lesson28;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/ask_details4")
    public String askEmployeeDetailsView(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view4";
    }

    @RequestMapping("/show_details4")
    public String showEmployeeDetailsView(@ModelAttribute("employee") Employee employee) {
        String name = "Mr." + employee.getName();
        employee.setName(name);
        return "show-emp-details-view4";
    }
}
