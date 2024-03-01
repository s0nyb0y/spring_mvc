package com.radik.spring_course.lesson23;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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
    public String showEmployeeDetailsView(){
        return "show-emp-details-view";
    }
}
