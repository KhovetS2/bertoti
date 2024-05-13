package org.example;

public class Fedora {
    private String distroName = "Fedora";


    public String getDistroName() {
        return distroName;
    }

    public void construirContainer(){
        System.out.println("Contruindo Container...");
        System.out.println("Container construido com sucesso!");
    }
}
