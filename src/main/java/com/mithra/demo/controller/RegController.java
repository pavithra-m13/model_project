// package com.mithra.demo.controller;


// import java.util.Objects;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;

// import com.mithra.demo.domain.Login;
// import com.mithra.demo.service.Regservice;

// @Controller
// public class RegController {
 
//     @Autowired
//     private Regservice service;
 
//     @PostMapping("/reg")
//     public String register(@ModelAttribute("user") Login user) {
//         service.saveUser(user.getUsername(), user.getPassword());
//         return "redirect:/display";   }   
// }

