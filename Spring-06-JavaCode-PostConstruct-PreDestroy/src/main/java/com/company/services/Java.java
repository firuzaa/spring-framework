package com.company.services;

import com.company.interfaces.Courses;
import org.springframework.stereotype.Component;

@Component
public class Java implements Courses {
    public void getTeachingHours() {
        System.out.println("weekly teaching hours: 30");
    }
}
