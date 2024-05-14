package org.example;

import java.util.ArrayList;
import java.util.Random;

public class EstacaoMetereologica {
    private String fenomeno;
    private ArrayList<Subscriber> subscribers;

    public EstacaoMetereologica(){
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber sub){
        subscribers.add(sub);
    }

    public void unsubscribe(Subscriber sub){
        subscribers.remove(sub);
    }

    public void notifySubscriber(){
        subscribers.forEach(subscriber -> subscriber.update(fenomeno));
    }

    public void analisaFenomeno(){
        Random random = new Random();
        int numero  = random.nextInt(5);

        if (numero ==1){
            fenomeno="Furacão";
        } else if (numero == 2) {
           fenomeno = "Chuva";
        } else if (numero == 3) {
            fenomeno = "Terremoto";
        } else if (numero == 4) {
            fenomeno = "Deslisamento";
        } else{
            fenomeno = "Nublado";
        }
    }
}
