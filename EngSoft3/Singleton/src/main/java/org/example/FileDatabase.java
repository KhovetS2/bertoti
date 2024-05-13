package org.example;

public class FileDatabase {
    private static FileDatabase instancia;

    private FileDatabase(){

    }

    public static FileDatabase getInstance() {
        if(instancia == null){
            instancia = new FileDatabase();
        }
        return FileDatabase.instancia;
    }

    public void write(String mensage){
        System.out.println("A mensagem: "+ mensage + " foi escrita com sucesso!");

   }
}
