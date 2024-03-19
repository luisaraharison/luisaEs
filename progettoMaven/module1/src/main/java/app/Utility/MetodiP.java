package app.Utility;

import app.Entity.Genere;
import app.Entity.Stato;
import app.Service.Metodi;
import java.time.LocalDateTime;

public class MetodiP {
    public void altriMetodi() {
        Metodi m = new Metodi();
        //m.listaLibri();
        //m.aggiungiLibro(6," IT.", 21.99, Genere.horror, LocalDateTime.of(1970, 01, 01, 16, 30, 21), Stato.disponibile);
        //m.aggiornaPrezzo(2, 15.00);
        //m.aggiornaStato(2, Stato.esaurito);
        //m.cercaLibroPerId(3);
        //m.eliminaLibro(5);
        m.ricercaLibro("re", LocalDateTime.of(1994, 01, 01, 16, 30, 21), LocalDateTime.of(1998, 01, 01, 12, 12, 12));
    }
   
   
}
