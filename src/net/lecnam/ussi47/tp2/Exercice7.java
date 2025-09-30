package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice7 {

    public static void main(String[] args) {
        int x = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println("Le nombre " + x + " est " + (x % 2 == 0 ? "Pair" : "Impair"));

    }
}