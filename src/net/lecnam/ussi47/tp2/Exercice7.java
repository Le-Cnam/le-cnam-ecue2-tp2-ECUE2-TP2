package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice7 {

    public static void main(String[] args) {
        //Sachant que ThreadLocalRandom.current().nextInt(1,101)
        //retourne un chiffre entre 1 et 100, écrire un programme qui
        int random = ThreadLocalRandom.current().nextInt(1,101);
        if (random % 2 == 0) {
            System.out.println(random + " est pair");
        }
        else  {
            System.out.println(random + " est impair");
        }
    }
}
