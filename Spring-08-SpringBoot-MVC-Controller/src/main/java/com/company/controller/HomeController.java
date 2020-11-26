package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){
        System.out.println("Name is "+name);
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx2(@PathVariable("name") String name, @PathVariable("email") String email){
        System.out.println("Name is "+name);
        System.out.println("Emil is "+email);
        return "home";
    }

    @GetMapping("/home/course")
    public String requestParamEx(@RequestParam("course") String course){
        System.out.println("Name is "+course);
        return "home";
    }

    @GetMapping(value = "/course")
    public String requestParamEx2(@RequestParam(value = "name", required = false, defaultValue = "Cybertek")String name){
        System.out.println("Name is "+name);
        return "home";
    }
}
