package com.nighthawk.spring_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class frqpath {
    @GetMapping("/FRQs")
    // @RequestParam handles variables binding to frontend, defaults, etc
    public String FRQs(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        // load HTML VIEW (greet.html)
        return "frqpath"; 

    }
}
