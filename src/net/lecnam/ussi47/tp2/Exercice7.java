package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice7 {

    public static void main(String[] args) {
        int random = ThreadLocalRandom.current().nextInt(1,101);

        if (random%2 == 0){
            System.out.println("Le nombre " + random + " est paire");

        }else
            System.out.println("Le nombre " + random +" est impaire");


    }
}
