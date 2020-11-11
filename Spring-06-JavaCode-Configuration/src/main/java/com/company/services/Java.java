package com.company.services;

import com.company.interfaces.Course;
import com.company.interfaces.ExtraSession;


public class Java implements Course {

    private ExtraSession extraSession;

    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: "+(22+extraSession.getHours()));
    }
}
