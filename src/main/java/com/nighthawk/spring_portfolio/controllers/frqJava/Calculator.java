package com.nighthawk.spring_portfolio.controllers.frqJava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Calculator {

    // CONTROLLER handles GET request for /birds, maps it to birds() method
    @GetMapping("/FRQs/calculator")
    public String calculator() {

        // load HTML VIEW (birds.html)
        return "FRQs/calculator";

    }
}
