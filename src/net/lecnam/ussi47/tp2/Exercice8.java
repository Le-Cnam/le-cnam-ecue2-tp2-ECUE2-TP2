package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {
        int te = ThreadLocalRandom.current().nextInt(1900,2050);
        System.out.println(te);
        System.out.println(te %4 == 0);
        System.out.println(te % 100 != 0);
        System.out.println(te % 400 == 0);
        System.out.println((te %4 == 0 && te % 100 != 0) || te % 400 == 0);
    }
}

