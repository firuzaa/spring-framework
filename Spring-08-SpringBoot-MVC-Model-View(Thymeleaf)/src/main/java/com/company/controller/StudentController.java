package com.company.controller;

import com.company.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homepage(Model model){

        model.addAttribute("name","Feruza");
        model.addAttribute("age","25");
        model.addAttribute("course","MVC");

        String subject = "Collections";
        model.addAttribute("subject",subject);

        int stuID = new Random().nextInt(1000);
        model.addAttribute("stuID",stuID);

        List<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(4);
        number.add(6);
        model.addAttribute("number",number);

        LocalDate bday = LocalDate.now().minusYears(25);
        model.addAttribute("bday",bday);

        Student student = new Student(1,"Mike","Smith");
        model.addAttribute("student",student);

        return "student/welcome";
    }


    @GetMapping("/register")
    public String homepage2(){
        return "student/register";
    }


}
