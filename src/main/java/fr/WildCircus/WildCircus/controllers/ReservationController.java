package fr.WildCircus.WildCircus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.WildCircus.WildCircus.entities.Price;
import fr.WildCircus.WildCircus.entities.Reservation;
import fr.WildCircus.WildCircus.repositories.PriceRepository;
import fr.WildCircus.WildCircus.repositories.ReservationRepository;

@Controller
public class ReservationController {

    @Autowired
    PriceRepository priceRepository;
    
    @Autowired
    ReservationRepository reservationRepository;

    @GetMapping("/reservations/add")
    public String add(Model model) {
        model.addAttribute("reservation", new Reservation());
        List<Price> prices = priceRepository.findAll();
        model.addAttribute("prices", prices);
        List<Reservation> reservation = reservationRepository.findAll();
        model.addAttribute("reservations", reservation);
        return "reservations/add";
    }
    @PostMapping("/reservations/add")
    public String add(@ModelAttribute Reservation reservation){
        reservation = reservationRepository.save(reservation);
        return "redirect:add";
    }

}