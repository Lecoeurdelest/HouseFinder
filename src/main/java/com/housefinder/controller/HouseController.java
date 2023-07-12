package com.housefinder.controller;

import com.housefinder.dto.HouseDto;
import com.housefinder.entity.House;
import com.housefinder.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class HouseController {

    @Autowired
    private HouseService houseService;

    @GetMapping("/houselist/{pageNumber}")
    public String getHouseDto(@PathVariable int pageNumber, Model model) {
        Page<House> housePage = houseService.getHouse(pageNumber);
        List<House> houses = housePage.getContent();
        model.addAttribute("houses", houses);
        model.addAttribute("currentPage", housePage.getNumber());
        model.addAttribute("totalPages", housePage.getTotalPages());
        return "houselist";
    }


}
