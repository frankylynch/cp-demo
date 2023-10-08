package com.fjlhome.cpdemo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
// ? why is the thymeleaf binding not working?
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    public String calculatorPage(Model model) {
        return "calculator-display";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam(name = "num1") double num1,
            @RequestParam(name = "num2") double num2,
            @RequestParam(name = "operator") String operator,
            Model model) {

        double result;
        switch (operator) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    model.addAttribute("error", "Division by zero is not allowed.");
                    return "calculator";
                }
                break;
            default:
                model.addAttribute("error", "Invalid operator.");
                return "calculator";
        }

        model.addAttribute("result", result);
        return "calculator";
    }
}
