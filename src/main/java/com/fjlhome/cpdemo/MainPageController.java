package com.fjlhome.cpdemo;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//generate a home page at localhost:8080
@Controller
public class MainPageController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(HttpServletResponse response) {
        response.setContentType("text/html");
        return "home";
    }

    //generate a page at localhost:8080/index
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpServletResponse response) {
        response.setContentType("text/html");
        return "index";
    }

    //generate a hello-world page at localhost:8080/hello
    @GetMapping("/hello2")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, Thymeleaf!");
        return "hello-world"; // This maps to "hello-world.html"
    }
}

