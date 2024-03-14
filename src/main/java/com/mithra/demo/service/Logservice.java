package com.mithra.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mithra.demo.domain.Login;
import com.mithra.demo.repository.logrepo;

@Service
public class Logservice {
@Autowired
private logrepo rep ;
 public Login log(String username,String password)
 {
    Login user=rep.findByUsernameAndPassword(username,password);
    return user;
 } 
}
