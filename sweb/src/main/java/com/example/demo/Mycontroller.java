package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Mycontroller {

    @GetMapping("/")
    public String page() {
        return "index";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user, Model model) {
       
        System.out.println(user);

      
        model.addAttribute("fname", user.getFname());
        model.addAttribute("lname", user.getLname());
        model.addAttribute("phone", user.getPhone());
        model.addAttribute("pass", user.getPass());

       
        return "success";
    }
}
