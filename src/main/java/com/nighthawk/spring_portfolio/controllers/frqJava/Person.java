package com.nighthawk.spring_portfolio.controllers.frqJava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Person {

    // CONTROLLER handles GET request for /birds, maps it to birds() method
    @GetMapping("/FRQs/person")
    public String person() {

        // load HTML VIEW (birds.html)
        return "FRQs/person";

    }
}
