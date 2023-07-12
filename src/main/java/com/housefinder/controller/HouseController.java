package com.housefinder.controller;

import com.housefinder.dto.HouseDto;
import com.housefinder.entity.House;
import com.housefinder.entity.User;
import com.housefinder.entity.Utility;
import com.housefinder.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
import java.util.Set;

import java.util.List;

@Controller
@RequestMapping(value = "/houses")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @GetMapping("houselist/{pageNumber}")
    public String getHouseDto(@PathVariable int pageNumber, Model model) {
        Page<House> housePage = houseService.getHouse(pageNumber);
        List<House> houses = housePage.getContent();
        model.addAttribute("houses", houses);
        model.addAttribute("currentPage", housePage.getNumber());
        model.addAttribute("totalPages", housePage.getTotalPages());
        return "houselist";
    }


    @GetMapping(value = "/{id}")
    public String getHouseById(Model model, @PathVariable long id){
        House house = houseService.getHouseById(id);
        Set<Utility> utilities = house.getUtilities();
        User owner = house.getOwner();
        model.addAttribute("house",house);
        model.addAttribute("utilities", utilities);
        model.addAttribute("owner", owner);
        return "housedetail";
    }
}
