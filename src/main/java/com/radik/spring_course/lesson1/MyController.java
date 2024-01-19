package com.radik.spring_course.lesson1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/hello_world")
    public String sayHello(){
        return "hello";
    }
}
