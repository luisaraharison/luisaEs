package app.Utility;

import app.Entity.Genere;
import app.Entity.Stato;
import app.Service.Metodi;
import java.time.LocalDateTime;

public class MetodiP {
    public void altriMetodi() throws Exception {
        Metodi m = new Metodi();
        //m.listaLibri();
        //m.aggiungiLibro(6," IT.", 21.99, Genere.horror, LocalDateTime.of(1970, 01, 01, 16, 30, 21), Stato.disponibile);
        //m.aggiornaTitolo(1, "Emma");
        //m.aggiornaPrezzo(2, 40.00);
        //m.stampaPrezzoP(1);
        m.stampaLibriPrezzoP();
        //m.infoPrezzoP(1);
        //m.aggiornaStato(1,2);
        //m.cercaLibroPerId(3);
        //m.eliminaLibro(5);
        //m.ricercaLibro("re", LocalDateTime.of(1994, 01, 01, 16, 30, 21), LocalDateTime.of(1998, 01, 01, 12, 12, 12));
    }
   
   
}
