package fr.WildCircus.WildCircus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.WildCircus.WildCircus.entities.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
}