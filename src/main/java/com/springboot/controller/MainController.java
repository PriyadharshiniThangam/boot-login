package com.springboot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.model.Login;
import com.springboot.model.User;
import com.springboot.service.UserService;

@Controller
public class MainController {

  @Autowired
  public UserService userService;

  @GetMapping("/")
  public String home(Map<String, Object> map) {
    return "home";
  }

  @GetMapping("/showLoginPage")
  public String showLoginPage(ModelMap model) {
    model.addAttribute(new Login());

    return "login";
  }

  @GetMapping("/showRegistrationPage")
  public String showRegistrationPage(ModelMap model) {
    model.addAttribute(new User());

    return "registration";
  }

}