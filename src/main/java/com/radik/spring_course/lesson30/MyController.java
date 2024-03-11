package com.radik.spring_course.lesson30;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "first-view3";
    }
    @RequestMapping("/ask_details6")
    public String askEmployeeDetailsView(Model model){
        model.addAttribute("employee",new Employee());
        return "ask-emp-details-view6";
    }
    @RequestMapping("/show_details6")
    public String showEmployeeDetailsView(@Valid @ModelAttribute("employee")Employee employee
            , BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "ask-emp-details-view6";
        }else {
            return "show-emp-details-view6";
        }
    }
}
