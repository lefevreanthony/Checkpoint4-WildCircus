package fr.WildCircus.WildCircus.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.WildCircus.WildCircus.repositories.PriceRepository;

@Controller
public class PriceController {

    @Autowired
    PriceRepository priceRepository;

    @GetMapping("/prices")
    public String browse(Model model) {
        
        return "prices/browse";
        
    }
}