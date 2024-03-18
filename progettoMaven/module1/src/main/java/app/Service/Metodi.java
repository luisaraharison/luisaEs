package app.Service;

import java.util.ArrayList;
import java.util.List;

import app.Entity.Attributi;

public class Metodi {
    private List<Attributi> attributi;
    

    public Metodi(){
        attributi = new ArrayList<>();//creo una lista
        attributi.add(null);
    }

    public void metodo1() {
        for (Attributi a : attributi) {
            System.out.println(a.getAttributo1() + a.getAttributo2() + a.getAttributo3());//stampa la lista
        }	
   }
   public void metodo2(String a,String b) {
    for (Attributi t : attributi) {
        if(t.getAttributo1().equals(a)) {
            t.setAttributo1(b);
            System.out.println(t.getAttributo1());
            }
        }
    }
}

