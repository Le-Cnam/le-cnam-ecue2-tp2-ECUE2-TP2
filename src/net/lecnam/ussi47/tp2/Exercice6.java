package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom ;

public class Exercice6 {

    public static void main(String[] args) {
        int valeur = ThreadLocalRandom.current().nextInt(0, 2);
        boolean valeurBooleene = (valeur == 1) ;
        System.out.println(valeurBooleene) ;
    }
}
