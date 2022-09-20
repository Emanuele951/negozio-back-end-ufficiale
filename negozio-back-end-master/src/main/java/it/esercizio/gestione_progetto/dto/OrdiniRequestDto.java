package it.esercizio.gestione_progetto.dto;

import java.util.List;

import it.esercizio.gestione_progetto.model.Prodotti;

public class OrdiniRequestDto {
    // dovrebbero essere stringa
    private String data;
    private String totale;
    private String idCliente;
    private List<Prodotti> listaProdotti;

    public OrdiniRequestDto(String data, String totale, String idCliente, List<Prodotti> listaProdotti) {
	super();
	this.data = data;
	this.totale = totale;
	this.idCliente = idCliente;
	this.listaProdotti = listaProdotti;
    }

    public String getData() {
	return data;
    }

    public OrdiniRequestDto() {
	super();
    }

    public void setData(String data) {
	this.data = data;
    }

    public String getTotale() {
	return totale;
    }

    public void setTotale(String totale) {
	this.totale = totale;
    }

    public String getIdCliente() {
	return idCliente;
    }

    public void setIdCliente(String idCliente) {
	this.idCliente = idCliente;
    }

    public List<Prodotti> getListaProdotti() {
	return listaProdotti;
    }

    public void setListaProdotti(List<Prodotti> listaProdotti) {
	this.listaProdotti = listaProdotti;
    }

//	public OrdiniRequestDto(String data, String totale, String idCliente) {
//	super();
//	this.data = data;
//	this.totale = totale;
//	this.idCliente = idCliente;
//	}
//	public String getData() {
//		return data;
//	}
//	public void setData(String data) {
//		this.data = data;
//	}
//	public String getTotale() {
//		return totale;
//	}
//	public void setTotale(String totale) {
//		this.totale = totale;
//	}
//	public String getIdCliente() {
//		return idCliente;
//	}
//	public void setIdCliente(String idCliente) {
//		this.idCliente = idCliente;
//	}

}
