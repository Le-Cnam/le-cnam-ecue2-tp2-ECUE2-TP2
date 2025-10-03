package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice13 {

    public static void main(String[] args) {
        //Calculer le factoriel de ThreadLocalRandom.current().nextInt(0,9)
        int random = ThreadLocalRandom.current().nextInt(0,9);
        int fact = 1 ;
        for ( int i = random; i > 0; i--) {
            fact *= i ;
            System.out.println(i + " * " + fact/i + " = " +  fact);
        }
        System.out.println("\nFactoriel de " + random + " = " + fact);
    }
}
