package app.Service;

import java.util.ArrayList;
import java.util.List;

import app.Entity.Attributi;

public class Metodi {
    private List<Attributi> attributi;
    
    public Metodi(){
        attributi = new ArrayList<>();//creo una lista
        Attributi n = new Attributi();
        n.setAttributo1("Attributo 1 ");
        n.setAttributo2("Attributo 2 ");
        n.setAttributo3("Attributo 3 ");
        attributi.add(n);
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
            System.out.println(t.getAttributo1());//modifica l'attributo 1 in qualcos'altro
            }
        }
    }

    public void metodo3(String a,String b) {
        for (Attributi t : attributi) {
            if(t.getAttributo2().equals(a)) {
                t.setAttributo2(b);
                System.out.println(t.getAttributo2());//modifica l'attributo 2 in qualcos'altro
                }
            }
        }
}

