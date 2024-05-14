package org.example;

public class Main {
    public static void main(String[] args) {

        EstacaoMetereologica estacao = new EstacaoMetereologica();
        estacao.subscribe(new Civil());
        estacao.subscribe(new Civil());
        estacao.subscribe(new Civil());
        estacao.subscribe(new Civil());
        estacao.analisaFenomeno();
        estacao.notifySubscriber();
        estacao.analisaFenomeno();
        estacao.notifySubscriber();
    }
}