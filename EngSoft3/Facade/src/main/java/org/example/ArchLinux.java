package org.example;

public class ArchLinux {
    private String distroName = "ArchLinux";


    public String getDistroName() {
        return distroName;
    }

    public void construirContainer(){
        System.out.println("Contruindo Container...");
        System.out.println("Container construido com sucesso!");
    }
}
