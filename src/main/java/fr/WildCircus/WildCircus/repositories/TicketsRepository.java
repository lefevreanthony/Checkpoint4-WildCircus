package fr.WildCircus.WildCircus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.WildCircus.WildCircus.entities.Tickets;

@Repository
public interface TicketsRepository extends JpaRepository<Tickets, Long> {
}