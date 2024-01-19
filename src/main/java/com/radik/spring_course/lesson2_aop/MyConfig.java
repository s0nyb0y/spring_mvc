package com.radik.spring_course.lesson2_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.radik.spring_course.lesson2_aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
