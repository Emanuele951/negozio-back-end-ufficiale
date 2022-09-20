package it.esercizio.gestione_progetto.model;

import java.io.Serializable;

import javax.persistence.*;



@Entity
@Table(name = "clienti")
public class Clienti implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private Integer idCliente;
	
	private String nome;
	
	private String cognome;
	
//	@OneToMany( mappedBy = "clienti" )
//	private List<Ordini> ordini;

	public Clienti() {
		super();
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


//	public List<Ordini> getOrdini() {
//		return ordini;
//	}
//
//
//	public void setOrdini(List<Ordini> ordini) {
//		this.ordini = ordini;
//	}
	
	

}
