package org.example;

import java.util.ArrayList;

public class DoceCategoria implements Doce{
    private ArrayList<Doce> doces;

    public DoceCategoria(){
        doces = new ArrayList<>();
    }
    public void produzir(){
        doces.forEach(doce -> doce.produzir());
    }

    public void addDoce(Doce doce){
        doces.add(doce);
    }

    public void remodeDoce(Doce doce){
        doces.remove(doce);
    }

    public ArrayList<Doce> getDoces() {
        return doces;
    }
}
