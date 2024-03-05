package com.radik.spring_course.lesson25;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }
    @RequestMapping("/ask_details")
    public String askEmployeeDetailsView(){
        return "ask-emp-details-view";
    }
    @RequestMapping("/show_details")
    public String showEmployeeDetailsView(@RequestParam("employeeName") String empName, Model model){
        empName = "Ms." + empName;
        model.addAttribute("nameAttribute",empName);
        return "show-emp-details-view";
    }
}
