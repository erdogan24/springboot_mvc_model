package com.springboot.thymeleafdemo.controller;


import com.springboot.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {


    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        // create a student object
        Student theStudent = new Student();


        // add student object to the model
        theModel.addAttribute("student", theStudent);

        return "student-form";

    }
    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student thestudent) {

        // log the input data
        System.out.println("theStudent: " + thestudent.getFirstName() + " " + thestudent.getLastName());

        return "student-confirmation";
    }

}





