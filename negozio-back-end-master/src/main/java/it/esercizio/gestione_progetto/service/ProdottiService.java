package it.esercizio.gestione_progetto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.esercizio.gestione_progetto.dto.ProdottiDto;
import it.esercizio.gestione_progetto.model.Prodotti;
import it.esercizio.gestione_progetto.repository.ProdottiRepository;



@Service
public class ProdottiService {

	@Autowired
	ProdottiRepository prodottiRepository;
	
	public List<ProdottiDto> findAll() {
		List<Prodotti> prodottiModel = prodottiRepository.findAll();
		List<ProdottiDto> prodottiDto = new ArrayList<>();
		
		for (Prodotti variabileProdotti : prodottiModel) {
			prodottiDto.add(new ProdottiDto(variabileProdotti.getIdProdotto(), variabileProdotti.getNome(),variabileProdotti.getPrezzo(),variabileProdotti.getQuantitaResidua()));
		}
		
		return prodottiDto;
	}
	
	
}
