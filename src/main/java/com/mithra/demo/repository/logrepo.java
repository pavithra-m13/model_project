package com.mithra.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mithra.demo.domain.Login;

@Repository
public interface logrepo extends JpaRepository<Login,String>{
Login findByUsernameAndPassword(String username, String password);
    
} 
