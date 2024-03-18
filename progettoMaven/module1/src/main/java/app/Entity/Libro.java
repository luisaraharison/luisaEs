package app.Entity;

import java.time.LocalDateTime;

    //titolo, stato (int) enum.disponibile che restituisce int, prezzo double, dataPubblicazione
    public class Libro {
        private String titolo;
        private double prezzo;
        private Stato stato;
        private LocalDateTime dataPubblicazione;
        private Genere genere;
    
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
    
        public Stato getStato() {
            return stato;
        }
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
    }
    

