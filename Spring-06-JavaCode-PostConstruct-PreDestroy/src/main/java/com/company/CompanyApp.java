package com.company;

import com.company.config.CompanyAppConfig;
import com.company.interfaces.Courses;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompanyApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(CompanyAppConfig.class);
        Courses courses = container.getBean("selenium", Courses.class);
        courses.getTeachingHours();

        ((AnnotationConfigApplicationContext)container).close();
    }
}
