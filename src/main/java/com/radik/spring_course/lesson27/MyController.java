package com.radik.spring_course.lesson27;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/ask_details3")
    public String askEmployeeDetailsView(Model model){
        model.addAttribute("employee",new Employee());
        return "ask-emp-details-view3";
    }
    @RequestMapping("/show_details3")
    public String showEmployeeDetailsView(@ModelAttribute("employee")Employee emp){
        String name = "Mr." + emp.getName();
        emp.setName(name);
        return "show-emp-details-view3";
    }
}
