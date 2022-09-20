package it.esercizio.gestione_progetto.dto;

public class OrdiniDto {

    private double totale;
    private String data;
    private Integer idCliente;
    private int idOrdine;
//	private String nome;

    public OrdiniDto(String data, double totale, Integer idCliente, int idOrdine) {
	super();
	this.data = data;
	this.totale = totale;
	this.idCliente = idCliente;
	this.idOrdine = idOrdine;
    }

    public OrdiniDto() {
	super();
    }

    public int getIdOrdine() {
	return idOrdine;
    }

    public void setIdOrdine(int idOrdine) {
	this.idOrdine = idOrdine;
    }

    // public String getNome() {
//		return this.nome;
//	}
//	
//	public void setNome(String nome) {
//	this.nome = nome;
//	}
    public double getTotale() {
	return this.totale;
    }

    public void setTotale(int totale) {
	this.totale = totale;
    }

    public String getData() {
	return this.data;
    }

    public void setData(String data) {
	this.data = data;
    }

    public Integer getIdCliente() {
	return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
	this.idCliente = idCliente;
    }

}
