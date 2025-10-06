package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {
        //Sachat qu'une année est bissextile si :
        //si elle est divisible par 4 et non divisible par 100,
        // ou
        //si elle est divisible par 400.
        //Determiner si la valeur retournée par ThreadLocalRandom.current().nextInt(1900,2050) est bissextile ou non
        int annee = ThreadLocalRandom.current().nextInt(1900,2050);
        if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) {
            System.out.println(annee + " est bissextile");
        }
        else {
            System.out.println(annee + " n'est pas bissextile");
        }
    }
}
