package it.esercizio.gestione_progetto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.esercizio.gestione_progetto.dto.ClienteDto;
import it.esercizio.gestione_progetto.model.Clienti;
import it.esercizio.gestione_progetto.repository.ClientiRepository;

@Service
public class ClienteService {

    @Autowired
    ClientiRepository clientiRepository;

    public List<ClienteDto> findAll() {

	List<Clienti> clienti = clientiRepository.findAll();
	List<ClienteDto> clientiDto = new ArrayList<>();

	for (Clienti clientiSel : clienti) {

	    clientiDto.add(new ClienteDto(clientiSel.getIdCliente(), clientiSel.getCognome(), clientiSel.getNome()));

	}

	return clientiDto;
    }

}
