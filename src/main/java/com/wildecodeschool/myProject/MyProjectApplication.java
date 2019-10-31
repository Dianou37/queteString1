package com.wildecodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

   
    @RequestMapping("/")
    @ResponseBody
    public String index() 
    {
        return "<ul>"
        		+ "<li><a href='http://localhost:8080/doctor/1'>Doctor Number One</a></li>"
        		+ "<li><a href='http://localhost:8080/doctor/3'>Doctor Number Three</a></li>"
        		+ "<li><a href='http://localhost:8080/doctor/5'>Doctor Number Five</a></li>"
        		+ "<li><a href='http://localhost:8080/doctor/8'>Doctor Number Eight</a></li>"
        		+ "</ul>";
    }
    @RequestMapping("/doctor/1")
    @ResponseBody
    public String Doctor1() {
        return "William Hartnell";
    }
    @RequestMapping("/doctor/3")
    @ResponseBody
    public String Doctor3() {
        return "Jon Pertwee";
    }
    @RequestMapping("/doctor/5")
    @ResponseBody
    public String Doctor5() {
        return "Peter Davison";
    }
    @RequestMapping("/doctor/8")
    @ResponseBody
    public String Doctor8() {
        return "Paul McGann";
    }
}