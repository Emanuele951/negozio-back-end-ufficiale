package it.esercizio.gestione_progetto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.esercizio.gestione_progetto.model.Ordini;

public interface OrdiniRepository extends JpaRepository<Ordini, Integer> {

}
