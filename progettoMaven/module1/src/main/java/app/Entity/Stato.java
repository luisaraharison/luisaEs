package app.Entity;

public enum Stato {
    disponibile(0),
    esaurito(1),
    ordinato(2);

    private final int INDICE;

    private Stato(int INDICE) {
        this.INDICE = INDICE;
    }

    public int getIndice() {
        return INDICE;
    }
    
    public static int getIndiceByStato(Stato stato) {
        return stato.getIndice();
    }
    
}
    

