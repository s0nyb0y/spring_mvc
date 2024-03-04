package com.radik.spring_course.lesson24;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/ask_details")
    public String askEmployeeDetailsView() {
        return "ask-emp-details-view";
    }

    @RequestMapping("/show_details")
    public String showEmployeeDetailsView(HttpServletRequest request, Model model) {
        String empName = request.getParameter("employeeName");
        empName = "Mr." + empName;
        model.addAttribute("nameAttribute",empName);
        return "show-emp-details-view";
    }
}
