package com.radik.spring_course.lesson3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.radik.spring_course.lesson3")
@EnableAspectJAutoProxy
public class MyConfig {
}
