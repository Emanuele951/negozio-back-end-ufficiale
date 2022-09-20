package it.esercizio.gestione_progetto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.esercizio.gestione_progetto.dto.ClienteDto;
import it.esercizio.gestione_progetto.service.ClienteService;

@RestController
@RequestMapping(value="/cliente")
public class ClientiRestController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	public List<ClienteDto> findAll(){
		
		return clienteService.findAll();
		
	}

}
