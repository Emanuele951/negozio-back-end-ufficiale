package it.esercizio.gestione_progetto.utility;

import java.sql.Date;

public class Utilities {

    public static double CambioDouble(String totale) {
        double tot = Double.parseDouble(totale);
        return tot;
    }

    public static Date CambioData(String data) {
        Date d = Date.valueOf(data);
        return d;
    }

    public static int CambioInt(String idCliente) {
        int id_cliente = Integer.parseInt(idCliente);
        return id_cliente;
    }
}
