package org.example;

public class Civil implements Subscriber{

    public void update(String mensagem) {
        if(mensagem.equals("Furacão")){
            System.out.println("Correeeee é um furacão!!");
        }
        else{
            System.out.println(mensagem);
        }
    }
}

