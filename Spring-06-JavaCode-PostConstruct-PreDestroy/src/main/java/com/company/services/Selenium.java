package com.company.services;

import com.company.interfaces.Courses;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Selenium implements Courses {
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 20");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing post construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing pre destroy");
    }
}
