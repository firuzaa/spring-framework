package com.company.configs;

import com.company.interfaces.ExtraSession;
import com.company.services.Java;
import com.company.services.OfficeHours;
import com.company.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.company")
public class CompanyAppConfig {

    @Bean
    public Java java(){
        return new Java(extraSession());
    }
    @Bean
    public Selenium selenium(){
        return new Selenium();
    }
//    @Bean
//    public OfficeHours officeHours(){
//        return new OfficeHours();
//    }

    public ExtraSession extraSession(){
        return new OfficeHours();
    }
}
