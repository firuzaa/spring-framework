package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping1(){
        return "home";
    }

    @RequestMapping("/feruza")
    public String getRequestMapping2() {
        return "home";
    }

    @GetMapping("/spring")
    public String getMappingex(){
        return "home";
    }

    @PostMapping("/spring")
    public String getMappingex2(){
        return "home";
    }

}
