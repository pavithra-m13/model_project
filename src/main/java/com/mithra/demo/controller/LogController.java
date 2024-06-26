package com.mithra.demo.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mithra.demo.domain.Login;
import com.mithra.demo.service.Logservice;

@Controller
public class LogController {
 
    @Autowired
    private Logservice service;
 
    @GetMapping("/")
    public String api()
    {
        return "log";
    }
    
    @PostMapping("/log")
    public String login(@ModelAttribute("user") Login user) {
 
        Login oauthUser = service.log(user.getUsername(), user.getPassword());
 
        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/display";
        } else {
            return "redirect:/";
        }
    }
 
    @GetMapping("/display")
    public String display() {
        return "display";
    }
}
