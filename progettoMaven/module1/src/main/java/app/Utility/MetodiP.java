package app.Utility;

import app.Entity.Genere;
import app.Entity.Stato;
import app.Service.Metodi;
import java.time.LocalDateTime;

public class MetodiP {
    public void altriMetodi() {
        Metodi m = new Metodi();
        m.listaLibri();
        m.aggiungiLibro("IT", 21.99, Genere.horror, LocalDateTime.of(1970, 01, 01, 6, 30, 21), Stato.disponibile);
        m.aggiornaPrezzo(9.99, 15.00);
        //m.aggiornaStato();
        //m.eliminaLibro("Guerra e pace");
    }
   
   
}
