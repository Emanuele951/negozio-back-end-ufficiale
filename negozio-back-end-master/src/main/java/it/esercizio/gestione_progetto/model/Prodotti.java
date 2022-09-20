package it.esercizio.gestione_progetto.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Prodotti implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prodotto")
    private int idProdotto;

    private String nome;

    private double prezzo;

    @Column(name = "quantita_residua")
    private int quantitaResidua;

    @ManyToMany(mappedBy = "prodotti", fetch = FetchType.EAGER)
    private List<Ordini> ordini;

    public void addOrdini(Ordini ordinis) {
	ordini.add(ordinis);
	ordinis.getProdotti().add(this);
    }

    public Prodotti() {
    }

    public int getIdProdotto() {
	return idProdotto;
    }

    public void setIdProdotto(Integer idProdotto) {
	this.idProdotto = idProdotto;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public double getPrezzo() {
	return prezzo;
    }

    public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
    }

    public int getQuantitaResidua() {
	return quantitaResidua;
    }

    public void setQuantitaResidua(int quantitaResidua) {
	this.quantitaResidua = quantitaResidua;
    }

    public List<Ordini> getOrdini() {
	return ordini;
    }

    public void setOrdini(List<Ordini> ordini) {
	this.ordini = ordini;
    }

}
