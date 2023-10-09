package com.fjlhome.cpdemo.controller;

import com.fjlhome.cpdemo.processor.CalculatorProcessor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;


@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    public String calculatorPage(Model model) {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(
            // num or operation can be null
            @RequestParam(name = "num", required=false) Double num,
            @RequestParam(name = "operation", required=false) String operation, Model model) {

           CalculatorProcessor calculator = CalculatorProcessor.getInstance();
           calculator.applyOperation(operation, num);

           model.addAttribute("result", calculator.getDisplayNumber());
           return "calculator";
        }
}

