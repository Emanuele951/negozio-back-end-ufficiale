package it.esercizio.gestione_progetto.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import it.esercizio.gestione_progetto.Exception.OrdiniException;
import it.esercizio.gestione_progetto.dto.OrdiniDto;
import it.esercizio.gestione_progetto.model.Clienti;
import it.esercizio.gestione_progetto.model.Ordini;
import it.esercizio.gestione_progetto.model.Prodotti;
import it.esercizio.gestione_progetto.repository.OrdiniRepository;
import it.esercizio.gestione_progetto.repository.ProdottiRepository;

@Service
public class OrdiniService {

    @Autowired
    OrdiniRepository ordiniRepository;

    @Autowired
    ProdottiRepository prodottiRepository;

    public List<OrdiniDto> findAll() {

        List<Ordini> ordini = ordiniRepository.findAll();
        List<OrdiniDto> ordiniDto = new ArrayList<>();

        for (Ordini ordiniSel : ordini) {

            ordiniDto.add(new OrdiniDto(ordiniSel.getData().toString(), ordiniSel.getTotale(),
                    ordiniSel.getCliente().getIdCliente(), ordiniSel.getIdOrdine()));

        }
        return ordiniDto;
    }

    public void addOrdine(Date data, double totale) {

        Ordini ordini = new Ordini();
        ordini.setData(data);
        ordini.setTotale(totale);
        ordiniRepository.save(ordini);

    }

//    public void newOrdine(Date data, double totale, int id_cliente, List<Prodotti> listaProdotti) {
//	Clienti c = new Clienti();
//	c.setIdCliente(id_cliente);
//	Ordini ordine = new Ordini();
//	ordine.setCliente(c);
//	ordine.setData(data);
//	ordine.setTotale(totale);
//	ordine.setProdotti(listaProdotti);
//
//	int nuovaQuantita;
//	Prodotti p = new Prodotti();
//	for (int i = 0; i < listaProdotti.size(); i++) {
//	    if (listaProdotti.get(i).getQuantitaResidua() < 0) {
//		System.out.println("errore");
//	    } else {
//		nuovaQuantita = listaProdotti.get(i).getQuantitaResidua();
//		nuovaQuantita = nuovaQuantita - 1;
//		p.setQuantitaResidua(nuovaQuantita);
//	    }
//	}
//	prodottiRepository.save(p);
//	ordiniRepository.save(ordine);
//
//    }

    public void newOrdine(Date data, double totale, int id_cliente, List<Prodotti> listaProdotti) throws Exception {
        Clienti cliente = new Clienti();
        cliente.setIdCliente(id_cliente);

        Ordini ordine = new Ordini();
        ordine.setCliente(cliente);
        ordine.setData(data);
        ordine.setTotale(totale);
        ordine.setProdotti(listaProdotti);

        Prodotti prodotto = new Prodotti();

        for (int i = 0; i < listaProdotti.size(); i++) {
            int nuovaQuantita;
            int idprodotto = listaProdotti.get(i).getIdProdotto();
			prodotto = prodottiRepository.findById(idprodotto).get();

            if (prodotto.getQuantitaResidua() <= 0)
                throw new OrdiniException(HttpStatus.BAD_REQUEST, "Il prodotto selezionato non è più disponibile");

            else {
                nuovaQuantita = prodotto.getQuantitaResidua();
                nuovaQuantita = nuovaQuantita - 1;
                prodotto.setQuantitaResidua(nuovaQuantita);

                prodottiRepository.saveAndFlush(prodotto);

            }
        }
        ordiniRepository.save(ordine);

    }

}
