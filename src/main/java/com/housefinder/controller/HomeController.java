package com.housefinder.controller;

import com.housefinder.entity.House;
import com.housefinder.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping({"/", "/home"})
public class HomeController {
    @Autowired
    HouseService houseService;
    @GetMapping()
    public String home(Model model) {
        List<House> houses = houseService.getActiveHouses();
        model.addAttribute("houses", houses);
        return "home";
    }
}
