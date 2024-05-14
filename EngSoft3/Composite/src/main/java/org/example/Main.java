package org.example;

public class Main {
    public static void main(String[] args) {

        DoceCategoria doceCategoria = new DoceCategoria();
        doceCategoria.addDoce(new DoceItem("Brigadeiro"));
        doceCategoria.addDoce(new DoceItem("Beijinho"));
        doceCategoria.addDoce(new DoceItem("Bombom"));

        DoceCategoria doceCategoria2 = new DoceCategoria();
        doceCategoria2.addDoce(new DoceItem("Bolo"));
        doceCategoria2.addDoce(new DoceItem("Naked Cake"));
        doceCategoria2.addDoce(new DoceItem("Torta"));

        DoceCategoria allCategorias = new DoceCategoria();
        allCategorias.addDoce(doceCategoria);
        allCategorias.addDoce(doceCategoria2);

        allCategorias.produzir();
    }
}