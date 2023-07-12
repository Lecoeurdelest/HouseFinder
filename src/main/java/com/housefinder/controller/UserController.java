package com.housefinder.controller;

import com.housefinder.entity.User;
import com.housefinder.dto.UserDto;
import com.housefinder.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private UserService userService;


    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new UserDto());
        return "register";
    }

    public String forgotPassword(){
        return "/forgot-password";
    }

    @PostMapping("/register/save")
    public String processRegister(@Validated @ModelAttribute("user") UserDto userDto, BindingResult result, Model model) {

        User user = userService.findByEmail(userDto.getEmail());

        if (user != null && user.getEmail() != null && !user.getEmail().isEmpty()) {
            result.rejectValue("email", null, "There is already an account registered with the same email");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", userDto);
            return "redirect:/register";
        }
        userService.saveUser(userDto);
        return "redirect:/login";
    }

    @PostMapping("/forgot-password")
    public String processForgotPassword(@RequestParam("email") String email){
        userService.forgotPassword(email);
        return "redirect:/login";
    }
}
