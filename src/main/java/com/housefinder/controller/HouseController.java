package com.housefinder.controller;

import com.housefinder.dto.HouseDto;
import com.housefinder.service.HouseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HouseController {

    private HouseService houseService;


    @GetMapping("/house/{pageNumber}")
    public HouseDto getHouseDto(@PathVariable int pageNumber){
        return null;
    }
}
