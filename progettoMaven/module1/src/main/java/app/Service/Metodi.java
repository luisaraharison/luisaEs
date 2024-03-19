package app.Service;

import java.util.ArrayList;
import java.util.List;

import app.Entity.Genere;
import app.Entity.Libro;
import app.Entity.Stato;
import java.time.LocalDateTime;

public class Metodi {
    private List<Libro> libri;
    
    public Metodi(){
        libri = new ArrayList<>();
        libri.add(new Libro(0,"Assassinio sull'Orient Express", 20.0, Genere.giallo , LocalDateTime.of(1999, 10, 04, 10, 40, 30), Stato.disponibile));
        libri.add(new Libro(1,"Harry Potter", 20.0, Genere.fantasy , LocalDateTime.of(1999, 10, 04, 10, 40, 30), Stato.disponibile));
        libri.add(new Libro(2,"Rebecca", 20.0, Genere.thriller , LocalDateTime.of(1999, 10, 04, 10, 40, 30), Stato.disponibile));
        libri.add(new Libro(3,"Orgoglio e pregiudizio", 20.0, Genere.rosa , LocalDateTime.of(1999, 10, 04, 10, 40, 30), Stato.disponibile));
        libri.add(new Libro(4,"Il giardino segreto", 20.0, Genere.fantasy , LocalDateTime.of(1999, 10, 04, 10, 40, 30), Stato.disponibile));
        libri.add(new Libro(5,"Guerra e pace", 20.0, Genere.romanzo , LocalDateTime.of(1999, 10, 04, 10, 40, 30), Stato.disponibile));

    }

    public void listaLibri() {
        for (Libro a : libri) {
            System.out.println("Id: " + a.getId() + "Titolo: " + a.getTitolo() + " Prezzo: " + a.getPrezzo() + " Genere: " + a.getGenere() + " Data di pubblicazione: " + a.getDatadiPubblicazione() + " Stato: " + a.getStato());
        }	
    }

    public void aggiungiLibro(int id, String titolo, double prezzo, Genere genere, LocalDateTime dataPubblicazione, Stato stato) {
            Libro libro = new Libro(6, "IT", 21.99, Genere.horror, LocalDateTime.of(1970, 01, 01, 6, 30, 21), Stato.disponibile); 
            libri.add(libro); 
            System.out.println(id + "Libro aggiunto: " + titolo + " Il prezzo è di " + prezzo + " euro. Il genere è " + genere + " ed è stato pubblicato il: " + dataPubblicazione + ". In questo momento è " + stato); 
            System.out.println(libri);//metodo toString

    }

    public void aggiornaPrezzo(int id,double prezzo2) {
        for (Libro t : libri) {
            if(t.getId() == id) { 
                t.setPrezzo(prezzo2); 
                System.out.println(t.getPrezzo());
                System.out.println("Per il libro in posizione:" + id + ", il nuovo prezzo è: " + prezzo2);
                System.out.println(libri);
            }
        }
    }
    public void aggiornaStato(int id, Stato stato2) {
        for (Libro t : libri) {
            if(t.getId() == id) {
                t.setStato(stato2);//think about it
                System.out.println(t.getStato());
                System.out.println("Per il libro in posizione:" + id + ", lo stato è: " + stato2);
                System.out.println(libri);
            }
        }
    }

    public Libro cercaLibroPerId(int id) {
        for (Libro libro : libri) {
            if (libro.getId() == id) {
                System.out.println(libro);
            } 
        }
                return null; 
                        
    }
    public void eliminaLibro(int s) {
        for (int i = 0; i < libri.size(); i++) {
            Libro libro = libri.get(i);
            if (libro.getId() == s) {
                libri.remove(i);
                System.out.println("Libro eliminato all'indice: " + s);
                System.out.println(libri);

            }
        }
    }
}

