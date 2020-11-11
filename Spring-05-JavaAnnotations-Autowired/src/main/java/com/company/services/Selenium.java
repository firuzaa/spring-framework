package com.company.services;

import com.company.interfaces.Course;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    @Autowired
    private OfficeHours officeHours;

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    /*
    //Constructor injection
    @Autowired
    public Selenium(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
    */
    /*
    //Setter injection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
*/
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (24 + officeHours.getHours()));
    }
}
