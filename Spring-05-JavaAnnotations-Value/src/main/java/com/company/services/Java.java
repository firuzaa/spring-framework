package com.company.services;

import com.company.interfaces.Course;
import com.company.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component

public class Java implements Course {

    @Value("Uyghur")
    private String person;

    @Value("${name}")
    private String name;

    @Value("${shows}")
    private String[] shows;

    @Override
    public String toString() {
        return "Java{" +
                "person='" + person + '\'' +
                ", name='" + name + '\'' +
                ", shows=" + Arrays.toString(shows) +
                '}';
    }

    //@Autowired
    //@Qualifier("officeHours")
    private ExtraSession extraSession;

    public Java(@Qualifier("mockInterviewHours") ExtraSession extraSession) {
        this.extraSession = extraSession;
    }
//private OfficeHours officeHours;
    //private MockInterviewHours mockInterviewHours;

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours for Java: " +(20+extraSession.getHours()));
    }
}
