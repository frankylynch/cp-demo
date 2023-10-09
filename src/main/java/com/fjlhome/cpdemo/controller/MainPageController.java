package com.fjlhome.cpdemo.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


//generate a home page at localhost:8080
@Controller
public class MainPageController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(HttpServletResponse response) {
        response.setContentType("text/html");
        return "home";
    }
}

