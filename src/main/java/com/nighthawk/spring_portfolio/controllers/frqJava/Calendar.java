package com.nighthawk.spring_portfolio.controllers.frqJava;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Calendar {

    // CONTROLLER handles GET request for /birds, maps it to birds() method
    @GetMapping("/FRQs/calendar")
    public String calendar(@RequestParam(year="year", required=false, defaultValue="year") String year, Model leap) {

        leap.addAttribute("year", year);

        // load HTML VIEW (birds.html)
        return "FRQs/calendar";

    }
}
