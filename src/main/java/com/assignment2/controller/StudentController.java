package com.assignment2.controller;

import com.assignment2.model.Student;
import com.assignment2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/index")
    public String viewIndexPage(){
        return "index";
    }

    @PostMapping("/register")
    public String registerStudent(@ModelAttribute(name = "registrationForm") Student student){
        Student student1 = studentRepository.save(student);
        if(student1 != null)
            return "program";
        else
            return "index";
    }
    @RequestMapping("/login")
    public String Login(@RequestParam("username1") String username,
                        @RequestParam("password1") String password, Model model){

        System.out.println(username);
        Student student1 = studentRepository.findByUsername(username);
        if(student1 == null){
            System.out.println("Student not found");
            return "index";
        }

        if (!student1.getPassword().equals(password)){
            System.out.println("Incorrect password!!");
            return "index";
        }
        model.addAttribute("firstName",student1.getFirstName());
        model.addAttribute("username",student1.getUsername());
        return "program";
    }

    @RequestMapping("/program")
    public String viewProgramPage() {
        return "program";
    }

    @RequestMapping("/checkout")
    public String viewCheckoutPage() {
        return "checkout";
    }

    @RequestMapping("/payment")
    public String handlePayment() {
        return "success";
    }
}