package app.Service;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import app.Entity.Genere;
import app.Entity.Libro;
import app.Entity.Stato;
import java.time.LocalDateTime;
import java.util.regex.*;

public class Metodi {
    private List<Libro> libri;
    
    public Metodi(){
        libri = new ArrayList<>();
        libri.add(new Libro(0,"Assassinio sull'Orient Express", 20.0, Genere.giallo , LocalDateTime.of(1999, 10, 04, 10, 40, 30), Stato.ordinato ));
        libri.add(new Libro(1,"Harry Potter", 40.0, Genere.fantasy , LocalDateTime.of(1998, 10, 04, 10, 40, 30), Stato.disponibile));
        libri.add(new Libro(2,"Rebecca", 20.0, Genere.thriller , LocalDateTime.of(1997, 10, 04, 10, 40, 30), Stato.disponibile));
        libri.add(new Libro(3,"Orgoglio e pregiudizio", 20.0, Genere.rosa , LocalDateTime.of(1996, 10, 04, 10, 40, 30), Stato.disponibile));
        libri.add(new Libro(4,"Il giardino segreto", 20.0, Genere.fantasy , LocalDateTime.of(1995, 10, 04, 10, 40, 30), Stato.disponibile));
        libri.add(new Libro(5,"Guerra e pace", 40.0, Genere.romanzo , LocalDateTime.of(1994, 10, 04, 10, 40, 30), Stato.disponibile));
        libri.add(new Libro(6,"Il ritratto di Dorian Gray", 20.0, Genere.romanzo , LocalDateTime.of(1994, 10, 04, 10, 40, 30), Stato.disponibile));
    }
/* 
    public void listaLibri() {
        for (Libro a : libri) {
            System.out.println("Id: " + a.getId() + "Titolo: " + a.getTitolo() + " Prezzo: " + a.getPrezzo() + " Genere: " + a.getGenere() + " Data di pubblicazione: " + a.getDatadiPubblicazione() + " Stato: " + a.getIndice());
        }	
    }
*/
    public void aggiungiLibro(int id, String titolo, double prezzo, Genere genere, LocalDateTime dataPubblicazione, Stato stato) {
            Libro libro = new Libro(6, "IT", 21.99, Genere.horror, LocalDateTime.of(1970, 01, 01, 16, 30, 21), Stato.disponibile); 
            libri.add(libro); 
            System.out.println(id + "Libro aggiunto: " + titolo + " Il prezzo è di " + prezzo + " euro. Il genere è " + genere + " ed è stato pubblicato il: " + dataPubblicazione + ". In questo momento è " + stato); 
            System.out.println(libri);//metodo toString

    }

    

    public void aggiornaTitolo(int id, String titolo) throws Exception {
        libri.stream()
             .filter(t -> t.getId() == id)
             .findFirst()
             .ifPresent(libro -> {
                 String titoloValido = titolo.trim(); 
                 if (Pattern.matches("^[A-Z0-9][a-zA-Z0-9]*$", titoloValido)) {//filtro per libri che non superano i 30euro
                     libro.setTitolo(titoloValido);
                     System.out.println(libro.getTitolo());
                     System.out.println("Per il libro in posizione:" + id + ", il nuovo titolo è: " + titoloValido);
                     System.out.println(libri);
                 } else {
                     throw new IllegalArgumentException("Il titolo non è nel formato corretto.");
                 }
             });
    }
    
    public void aggiornaPrezzo(int id, double prezzo2) {
        libri.stream()
             .filter(t -> t.getId() == id)
             .findFirst()
             .ifPresent(libro -> {
                 libro.setPrezzo(prezzo2);
                 System.out.println(libro.getPrezzo());
                 System.out.println("Per il libro in posizione:" + id + ", il nuovo prezzo è: " + prezzo2);
                 System.out.println(libri);
             });
    }
    /* 
    public void stampaPrezzoP(int id) {
        libri.stream()
             .filter(libro -> libro.getId() == id)
             .findFirst()
             .ifPresentOrElse(
                 libro -> {
                     if (libro.getPrezzo() <= 30.0) {
                         System.out.println("Il libro costa meno di 30 euro");
                     } else {
                         System.out.println("Il libro costa più di 30 euro");
                     }
                 },
                 () -> System.out.println("Nessun libro trovato con l'id specificato")
             );
    }
    */

    public Libro infoPrezzoP(int id) {
        List<Libro> libriFiltrati = libri.stream()
                                         .filter(libro -> libro.getId() == id)
                                         .filter(libro -> libro.getPrezzo() < 30.0)
                                         .collect(Collectors.toList());
        System.out.println("Libro trovato: " + libriFiltrati);
        if (libriFiltrati.isEmpty()) {
            System.out.println("Nessun libro trovato con prezzo inferiore a 30 euro per l'id " + id);
            return null;
        } else {
            return libriFiltrati.get(0); 
        }
    }
    

    public void stampaLibriPrezzoP() {
        List<Libro> libriMT = libri.stream()
            .filter(libro -> libro.getPrezzo() < 30.0)
            .collect(Collectors.toList());
    
        if (libriMT.isEmpty()) {
            System.out.println("Nessun libro trovato con prezzo inferiore a 30 euro.");
        } else {
            System.out.println("Libri con prezzo inferiore a 30 euro:");
            for (Libro libro : libriMT) {
                System.out.println(libro);
            }
        }
    }
    
    
    
    public void aggiornaStato(int id, int indiceStato) {
        libri.stream()
             .filter(t -> t.getId() == id)
             .findFirst()
             .ifPresent(libro -> {
                 Stato stato = Arrays.stream(Stato.values())
                                     .filter(s -> Stato.getIndiceByStato(s) == indiceStato)
                                     .findFirst()
                                     .orElse(null);
                 if (stato != null) {
                     libro.setStato(stato);
                     System.out.println("Per il libro in posizione: " + id + ", lo stato è: " + stato);
                 }
             });
    }
    

    public Libro cercaLibroPerId(int id) {
        return libri.stream()
                    .filter(libro -> libro.getId() == id)
                    .findFirst()
                    .orElse(null);
    }
    
    public void ricercaLibro(String titolo, LocalDateTime data1, LocalDateTime data2) throws Exception {
        try {
            libri.stream()
                .filter(libro -> libro.getTitolo().toLowerCase().contains(titolo.toLowerCase()))
                .forEach(libro -> {
                    System.out.println(libro.getTitolo().toLowerCase() + " contiene la stringa indicata." + "(" + titolo + ")");
                    if (libro.getDatadiPubblicazione().isAfter(data1) && libro.getDatadiPubblicazione().isBefore(data2)) {
                        System.out.println(libro.getTitolo() + " è nel range indicato.");
                    } else {
                        System.out.println(libro.getTitolo() + " è fuori dal range.");
                    }
                });
        } catch (Exception e) {
            System.out.println("Si è verificato un errore: " + e.getMessage());
            throw new Exception("Errore durante la ricerca dei libri.");
        }
    }
    


    public void eliminaLibro(int id) {
        libri = libri.stream()
                     .filter(libro -> libro.getId() != id)
                     .collect(Collectors.toList());
        System.out.println("Libro eliminato con successo.");
        System.out.println(libri);
    }
    
}
