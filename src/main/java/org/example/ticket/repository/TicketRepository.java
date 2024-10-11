package org.example.ticket.repository;

import org.example.ticket.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository interface for Ticket entity, extending the Jpa database repository to reference
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
