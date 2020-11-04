package com.company.services;

import com.company.interfaces.Course;

public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching hours: 15 Selenium Course");
    }
}
