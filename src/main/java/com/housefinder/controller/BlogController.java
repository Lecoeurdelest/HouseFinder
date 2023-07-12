package com.housefinder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blog-list")
    public String blogList(){
        return "bloglist";
    }
}
