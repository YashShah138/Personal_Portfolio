package com.nighthawk.spring_portfolio.controllers.frqJava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Calendar {

    // CONTROLLER handles GET request for /birds, maps it to birds() method
    @GetMapping("/calendar")
    public String calendar() {

        // load HTML VIEW (calendar.html)
        return "FRQs/calendar";

    }
}
