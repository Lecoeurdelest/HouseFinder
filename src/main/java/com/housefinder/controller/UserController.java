package com.housefinder.controller;

import com.housefinder.entity.User;
import com.housefinder.dto.UserReqDto;
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
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new UserReqDto());
        return "register";
    }

    public String forgotPassword(){
        return "/forgot-password";
    }

    @PostMapping("/register/save")
    public String processRegister(@Validated @ModelAttribute("user") UserReqDto userReqDto, BindingResult result, Model model) {

        User user = userService.findByEmail(userReqDto.getEmail());

        if (user != null && user.getEmail() != null && !user.getEmail().isEmpty()) {
            result.rejectValue("email", null, "There is already an account registered with the same email");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", userReqDto);
            return "redirect:/register";
        }
        userService.saveUser(userReqDto);
        return "redirect:/login";
    }

    @PostMapping("/forgot-password")
    public String processForgotPassword(@RequestParam("email") String email){
        userService.forgotPassword(email);
        return "redirect:/login";
    }
}
