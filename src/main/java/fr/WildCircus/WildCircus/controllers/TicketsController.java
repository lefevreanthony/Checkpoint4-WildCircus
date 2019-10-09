package fr.WildCircus.WildCircus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicketsController {

    @GetMapping("/tickets")
    public String tickets() {
        return "tickets/tickets";
    }

}