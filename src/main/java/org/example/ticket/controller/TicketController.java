package org.example.ticket.controller;

import org.example.ticket.model.Ticket;
import org.example.ticket.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TicketController {

    @Autowired
    TicketRepository ticketRepository;

    // Handles GET requests to /getTicket (the ticket display frontend page),
    // adds all tickets to the model and returns the ticket.html template
    // where the "ticket" is the name of the html attribute
    // you can see this by ctrl + clicking on the return statement
    @GetMapping("/getTicket")
    public String user(Model model) {

        model.addAttribute("tickets", ticketRepository.findAll());
        return "ticket";
    }
}
