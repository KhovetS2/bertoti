package org.example;

public class DoceItem implements Doce{

    private String nome;

    public DoceItem(String nome){
       this.nome = nome;
    }
    public void produzir() {

        System.out.println("Produzindo "+nome+" ...");
        System.out.println("Finalizado!");
    }
}
