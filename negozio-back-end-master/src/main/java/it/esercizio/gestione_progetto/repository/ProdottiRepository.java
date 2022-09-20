package it.esercizio.gestione_progetto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.esercizio.gestione_progetto.model.Prodotti;

public interface ProdottiRepository extends JpaRepository<Prodotti, Integer> {

}
