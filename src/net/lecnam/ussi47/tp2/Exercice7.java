package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom ;
public class Exercice7 {

    public static void main(String[] args) {
        int nombreX = ThreadLocalRandom.current().nextInt(1, 101) ;
        if (nombreX % 2 == 0) {
            System.out.println("Le nombre " + nombreX + " est pair");
        } else {
            System.out.println("Le nombre " + nombreX + " est impair");
        }
    }
}
