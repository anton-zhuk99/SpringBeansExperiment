package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private ApplicationContext context;

    @RequestMapping("/test")
    public String getEmployee() {
        context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        return context.getBean("employee", Employee.class).toString();
    }

}
