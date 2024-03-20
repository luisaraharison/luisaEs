package app.Entity;

import java.time.LocalDateTime;
    
    public class Libro {
        
            private int id;
            private String titolo;
            private double prezzo;
            private Genere genere;
            private LocalDateTime dataPubblicazione;
            private Stato stato;
        
            public Libro(int id, String titolo, double prezzo, Genere genere, LocalDateTime dataPubblicazione, Stato stato) {
                this.id = id;
                this.titolo = titolo;
                this.prezzo = prezzo;
                this.genere = genere;
                this.dataPubblicazione = dataPubblicazione;
                this.stato = stato;
            }
            
        
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
    
        public String getTitolo() {
            return titolo;
        }
        public void setTitolo(String titolo) {
            this.titolo = titolo;
        }
    
        public double getPrezzo() {
            return prezzo;
        }
        public void setPrezzo(double prezzo) {
            this.prezzo = prezzo;
        }
         /* 
        public Stato getStato() {
            return stato;
        }
        */
        public void setStato(Stato stato) {
            this.stato = stato;
        }
        
        public LocalDateTime getDatadiPubblicazione() {
            return dataPubblicazione;
        }
        public void setDatadiPubblicazione(LocalDateTime dataPubblicazione) {
            this.dataPubblicazione = dataPubblicazione;
        }

        public Genere getGenere() {
            return genere;
        }
        public void setGenere(Genere genere) {
            this.genere = genere;
        }
        
        @Override
        public String toString() {
            return "Id: " + id + ", Titolo: " + titolo + ", Prezzo: " + prezzo + " euro, Genere: " + genere + ", Data di pubblicazione: " + dataPubblicazione + ", Stato: " + stato;
        }
    }
    

