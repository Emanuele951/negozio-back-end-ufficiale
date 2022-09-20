package it.esercizio.gestione_progetto.dto;

public class ProdottiOrdinatiDto {
	private int idOrdine;
	private int idProdotto;
	public ProdottiOrdinatiDto(int idOrdine, int idProdotto) {
		super();
		this.idOrdine = idOrdine;
		this.idProdotto = idProdotto;
	}
	public int getIdOrdine() {
		return idOrdine;
	}
	public void setIdOrdine(int idOrdine) {
		this.idOrdine = idOrdine;
	}
	public int getIdProdotto() {
		return idProdotto;
	}
	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}
	
	
}
