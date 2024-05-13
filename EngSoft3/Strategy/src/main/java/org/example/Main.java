package org.example;

public class Main {

    public static void main(String[] args) {
        Peca peca1 = new Peca();
        peca1.setPecaStrategy(new Rainha());
        peca1.fazerAtaque();
        peca1.fazerMovimento();

        Peca peca2 = new Peca();
        peca2.setPecaStrategy(new Rei());
        peca2.fazerAtaque();
        peca2.fazerMovimento();

    }
}
