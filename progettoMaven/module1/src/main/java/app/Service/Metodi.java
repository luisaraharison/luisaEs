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
        libri = new ArrayList<>();//creo una lista di libri
        Libro n = new Libro();
        n.setTitolo("Assassinio sull'Orient Express");
        n.setTitolo("Harry Potter");
        n.setTitolo("Orgoglio e pregiudizio");
        n.setTitolo("Rebecca");
        n.setTitolo("Il grande Gatsby");
        n.setTitolo("Guerra e pace");
        libri.add(n);
    }

    public void listaLibri() {
        for (Libro a : libri) {
            System.out.println(a.getTitolo() + a.getPrezzo() + a.getGenere() + a.getDatadiPubblicazione() + a.getStato());
            }	
        }

        public void aggiungiLibro(String titolo, double prezzo, Genere genere, LocalDateTime dataPubblicazione, Stato stato) {
            Libro libro = new Libro(); 
            libri.add(libro); 
            System.out.println("Libro aggiunto: " + titolo + " Il prezzo è di " + prezzo + " euro. Il genere è " + genere + " ed è stato pubblicato il: " + dataPubblicazione + ". In questo momento è " + stato); 
        }

    public void aggiornaPrezzo(double prezzo1,double prezzo2) {
        for (Libro t : libri) {
            if(t.getPrezzo() == prezzo1) { 
                t.setPrezzo(prezzo2); 
                System.out.println(t.getPrezzo());
                }
            }
        }
                public void aggiornaStato(Stato stato1, Stato stato2) {
                    for (Libro t : libri) {
                        if(t.getStato().equals(stato1)) {
                            t.setStato(stato2);//think about it
                            System.out.println(t.getStato());
                            }
                        }
                    }

    public void eliminaLibro(String s) {
        for (int i = 0; i < libri.size(); i++) {
            Libro libro = libri.get(i);
            if (libro.getTitolo().equals(s)) {
                libri.remove(i);
                System.out.println("Libro eliminato: " + s);


                }
        }
}
}

