package org.example;

public class Debian {
    private String distroName = "Debian";


    public String getDistroName() {
        return distroName;
    }

    public void construirContainer(){
        System.out.println("Contruindo Container...");
        System.out.println("Container construido com sucesso!");
    }
}
