package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice6 {

    public static void main(String[] args) {
        byte func = (byte) ThreadLocalRandom.current().nextInt(0,2);
        System.out.println(func);
        System.out.println(func != 0);
    }
}
