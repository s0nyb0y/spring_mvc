package com.radik.spring_course.lesson5.aspects;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.radik.spring_course.lesson5")
@EnableAspectJAutoProxy
public class MyConfig {
}
