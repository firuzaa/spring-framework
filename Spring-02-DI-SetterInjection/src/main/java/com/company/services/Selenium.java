package com.company.services;

import com.company.interfaces.Course;

public class Selenium implements Course {

    OfficeHours officeHours;
    public Selenium(OfficeHours officeHours) {
        this.officeHours=officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching hours: "+ (15 +officeHours.getHours()));
    }
}
