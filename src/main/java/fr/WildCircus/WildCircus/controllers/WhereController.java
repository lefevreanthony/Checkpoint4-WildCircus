package fr.WildCircus.WildCircus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WhereController {

    @GetMapping("/where")
    public String where() {
        return "where/where";
    }

}