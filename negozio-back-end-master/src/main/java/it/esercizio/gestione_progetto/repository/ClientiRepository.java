package it.esercizio.gestione_progetto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.esercizio.gestione_progetto.model.Clienti;


public interface ClientiRepository extends JpaRepository<Clienti, Integer>{
	
	

}
