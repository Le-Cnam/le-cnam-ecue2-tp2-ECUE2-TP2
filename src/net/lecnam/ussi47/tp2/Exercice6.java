package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice6 {

    public static void main(String[] args) {
        int x = ThreadLocalRandom.current().nextInt(0, 2);
        if (x==0)
            {
            System.out.println ("false");
            }
        else
            {
            System.out.println ("true");
            }

    }
}
