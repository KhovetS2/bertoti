package org.example;

public class Main {
    public static void main(String[] args){

        Facade facade = new Facade();
        facade.criarContainer("ArchLinux");
        facade.criarContainer("Alphine");
        facade.criarContainer("Debian");
        facade.criarContainer("Fedora");
    }
}