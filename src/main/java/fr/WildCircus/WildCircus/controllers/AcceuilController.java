package fr.WildCircus.WildCircus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcceuilController {

    @GetMapping("/home")
    public String acceuil() {
        return "acceuil/acceuil";
    }

}