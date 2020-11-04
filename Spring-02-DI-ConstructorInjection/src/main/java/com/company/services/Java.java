package com.company.services;

import com.company.interfaces.Course;

public class Java implements Course {

    OfficeHours officeHours;

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching java hours: " + (20 + officeHours.getHours()));
    }
}
