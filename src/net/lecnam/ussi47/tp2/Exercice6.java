package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice6 {

    public static void main(String[] args) {
        //Sachant que ThreadLocalRandom.current().nextInt(0,2)
        //retourne 1 ou 0, écrire un programme qui affiche true si 1 ou
        //false si 0 selon le résultat retourné.
        int random = ThreadLocalRandom.current().nextInt(0,2) ;
        System.out.println("random = " + random);
        System.out.println(random != 0);
    }
}
