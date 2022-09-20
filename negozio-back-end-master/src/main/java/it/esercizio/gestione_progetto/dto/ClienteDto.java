package it.esercizio.gestione_progetto.dto;

public class ClienteDto {

    private Integer idCliente;

    private String nome;

    private String cognome;

    public ClienteDto(Integer idCliente, String nome, String cognome) {
	super();
	this.idCliente = idCliente;
	this.nome = nome;
	this.cognome = cognome;
    }

    public Integer getIdCliente() {
	return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
	this.idCliente = idCliente;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getCognome() {
	return cognome;
    }

    public void setCognome(String cognome) {
	this.cognome = cognome;
    }

}
