package com.company.services;

import com.company.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {

    public void getTeachingHours() {
        System.out.println("Weekly teaching hour for API: 15");
    }
}
