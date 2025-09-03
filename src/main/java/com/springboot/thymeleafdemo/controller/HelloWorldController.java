package com.springboot.thymeleafdemo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // new a controller method to show initial HTML form

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";

    }

    // need a controller method to process the HTML form

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    // need a controller method to rread form data and
    // add data to the model

    @RequestMapping("/processFormVersionTwo")
    public String letsShout(HttpServletRequest request, Model model){

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");
        // convert the data to all caps

        // create the message

        // add message to the model
        return "helloworld";
    }
}
