package it.esercizio.gestione_progetto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.esercizio.gestione_progetto.dto.ProdottiDto;
import it.esercizio.gestione_progetto.service.ProdottiService;

@RestController
@RequestMapping(value = "/prodotto")
public class ProdottiRestController {

	@Autowired
	ProdottiService prodottiService;
	
	@GetMapping
	public List<ProdottiDto> findAll(){
		return prodottiService.findAll();
	}
	
}
