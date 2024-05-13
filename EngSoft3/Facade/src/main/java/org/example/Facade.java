package org.example;

public class Facade {

    public void criarContainer(String subsystemName){
        if(subsystemName.equals("ArchLinux")) {
            ArchLinux novoContainer = new ArchLinux();
            novoContainer.construirContainer();
        } else if (subsystemName.equals("Alphine")) {
            Alphine novoContainer = new Alphine();
            novoContainer.construirContainer();
        } else if (subsystemName.equals("Debian")) {
            Debian novoContainer = new Debian();
            novoContainer.construirContainer();
        } else if (subsystemName.equals("Fedora")) {
            Fedora novoContainer = new Fedora();
            novoContainer.construirContainer();
        }
    }
}
