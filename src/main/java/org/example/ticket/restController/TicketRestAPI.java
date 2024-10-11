package org.example.ticket.restController;

import org.apache.coyote.Response;
import org.example.ticket.model.Ticket;
import org.example.ticket.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TicketRestAPI {

    @Autowired
    TicketRepository ticketRepository;

    // Handles POST requests to /ticket, creates a new ticket and
    // returns the created ticket with HTTP status of 201 (CREATED)
    @PostMapping("/ticket")
    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) {

        // the ticketRepository.save() method saves the ticket to the database
        // you pass in a new Ticket object with the ticket details from Ticket class
        // (first name, last name, dob, etc.)
        Ticket newTicket = ticketRepository.save(new Ticket(ticket.getFirstName(), ticket.getLastName(), ticket.getDob(), ticket.getFlightNumber(), ticket.getDepartureTime(), ticket.getArrivalTime(), ticket.getDepartureAirport(), ticket.getArrivalAirport()));

        // return the new ticket with HTTP status of 201 (CREATED)
        return new ResponseEntity<>(newTicket, HttpStatus.CREATED);
    }

    // Handles GET requests to /ticket, returns all tickets in the database
    // when navigating to http://localhost:8080/ticket
    // you will see all the tickets in the database in JSON format
    // this is not handling the frontend, it is just returning the data
    @GetMapping("/ticket")
    public ResponseEntity<List<Ticket>> getAllTickets() {

        List<Ticket> tickets = new ArrayList<Ticket>();

        ticketRepository.findAll().forEach(tickets::add);

        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }
}
