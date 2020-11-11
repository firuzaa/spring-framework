package com.company.services;

import com.company.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    public void getTeachingHours() {
        System.out.println("Weekly teaching Hours for Selenium: 30");
    }
}
