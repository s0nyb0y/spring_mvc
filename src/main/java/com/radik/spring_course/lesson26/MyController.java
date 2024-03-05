package com.radik.spring_course.lesson26;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class MyController {
    @RequestMapping("/ask_details2")
    public String askEmployeeDetailsView(Model model){
        model.addAttribute("employee",new Employee());
        return "ask-emp-details-view2";
    }
    @RequestMapping("show_details2")
    public String showEmployeeDetailsView(@ModelAttribute("employee")Employee employee){

        String name = employee.getName();
        employee.setName("Mr." + name);

        return "show-emp-details-view2";
    }
}
