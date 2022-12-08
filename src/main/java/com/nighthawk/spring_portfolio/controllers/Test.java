package com.nighthawk.spring_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {

    @GetMapping("/FRQs/test")
    // @RequestParam handles variables binding to frontend, defaults, etc
    public String test() {
        
        // load HTML VIEW (greet.html)
        return "FRQs/test"; 

    }
}
