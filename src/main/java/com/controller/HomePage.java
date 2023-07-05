package com.controller;

import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public String viewHomePage(){
        return "";
    }
}
