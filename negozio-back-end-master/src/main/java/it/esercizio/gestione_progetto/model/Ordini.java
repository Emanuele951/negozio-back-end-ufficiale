package it.esercizio.gestione_progetto.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordini")
public class Ordini implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ordine")
    private int idOrdine;

    private Date data;

    private double totale;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Clienti cliente;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "prodotti_ordinati", joinColumns = { @JoinColumn(name = "id_ordine") }, inverseJoinColumns = {
	    @JoinColumn(name = "id_prodotto") })
    private List<Prodotti> prodotti;

    public Ordini() {
    }

//	public Ordini(Date data, double totale) {
//		this.data = data;
//		this.totale = totale;
//	}

    public Ordini(int idOrdine, Date data, double totale, Clienti cliente, List<Prodotti> prodotti) {
	super();
	this.idOrdine = idOrdine;
	this.data = data;
	this.totale = totale;
	this.cliente = cliente;
	this.prodotti = prodotti;
    }

    public int getIdOrdine() {
	return idOrdine;
    }

//	public void setIdOrdine(Integer idOrdine) {
//		this.idOrdine = idOrdine;
//	}

    public Date getData() {
	return data;
    }

    public void setData(Date data) {
	this.data = data;
    }

    public double getTotale() {
	return totale;
    }

    public void setTotale(double totale) {
	this.totale = totale;
    }

    public Clienti getCliente() {
	return cliente;
    }

    public void setCliente(Clienti cliente) {
	this.cliente = cliente;
    }

    public List<Prodotti> getProdotti() {
	return prodotti;
    }

    public void setProdotti(List<Prodotti> prodotti) {
	this.prodotti = prodotti;
    }

}
