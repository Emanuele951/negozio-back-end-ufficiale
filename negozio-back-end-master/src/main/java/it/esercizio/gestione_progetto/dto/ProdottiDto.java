package it.esercizio.gestione_progetto.dto;

public class ProdottiDto {

    private int idProdotto;
    private String nome;
    private double prezzo;
    private int quantitaDisponibile;

    public ProdottiDto(int idProdotto, String nome, double prezzo, int quantitaDisponibile) {

        this.idProdotto = idProdotto;
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantitaDisponibile = quantitaDisponibile;

    }

    public ProdottiDto() {
        // TODO Auto-generated constructor stub
    }

    public int getIdProdotto() {
        return idProdotto;
    }

    public void setIdProdotto(int idProdotto) {
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

    public int getQuantitaDisponibile() {
        return quantitaDisponibile;
    }

    public void setQuantitaDisponibile(int quantitaDisponibile) {
        this.quantitaDisponibile = quantitaDisponibile;
    }

}
