package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom ;
public class Exercice13 {

    public static void main(String[] args) {
        int n = ThreadLocalRandom.current().nextInt(0, 9) ;
        long factoriel = 1;
        for (int i = 1; i <= n; i++) {
            factoriel *= i;
        }
        System.out.println("Le factoriel de " + n + " est " + factoriel) ;

    }
}
