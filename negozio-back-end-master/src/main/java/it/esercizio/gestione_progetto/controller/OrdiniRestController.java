package it.esercizio.gestione_progetto.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.esercizio.gestione_progetto.dto.OrdiniDto;
import it.esercizio.gestione_progetto.dto.OrdiniRequestDto;
import it.esercizio.gestione_progetto.service.OrdiniService;
import it.esercizio.gestione_progetto.utility.Utilities;

@RestController
@RequestMapping(value = "/ordine")
public class OrdiniRestController {

    Utilities u = new Utilities();

    @Autowired
    OrdiniService ordiniService;

    @GetMapping(value = "/allOrder")
    public List<OrdiniDto> findAll() {
	return ordiniService.findAll();
    }

    @GetMapping(value = "/nuovo")
    public void addOrdine(@RequestParam(name = "data") Date data, @RequestParam(name = "totale") double totale) {
	ordiniService.addOrdine(data, totale);
    }

    @PostMapping(value = "/new")
    public ResponseEntity newOrdine(@RequestBody OrdiniRequestDto ordiniRequestDto) {

	double totale = Utilities.CambioDouble(ordiniRequestDto.getTotale());
	Date data = Utilities.CambioData(ordiniRequestDto.getData());
	int id = Utilities.CambioInt(ordiniRequestDto.getIdCliente());

	try {
	    ordiniService.newOrdine(data, totale, id, ordiniRequestDto.getListaProdotti());
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    return new ResponseEntity<>("Year of birth cannot be in the future", HttpStatus.BAD_REQUEST);
	}

	return ResponseEntity.ok().build();

    }

}
