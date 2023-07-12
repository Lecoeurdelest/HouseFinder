package com.housefinder.controller;

import com.housefinder.entity.House;
import com.housefinder.service.HouseService;
import com.housefinder.session.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping({"/", "/home"})
public class HomeController {
    @Autowired
    HouseService houseService;
    @Autowired
    Search search;
    @GetMapping()
    public String home(Model model) {
        String currentSearch = search.getCurrentSearch() == null ? "" : search.getCurrentSearch();
        List<House> houses = houseService.getActiveHouses(currentSearch);
        model.addAttribute("houses", houses);
        return "home";
    }
    @PostMapping
    public String search(@RequestParam String currentSearch){
        search.setCurrentSearch(currentSearch);
        return "redirect:/home";
    }


}
