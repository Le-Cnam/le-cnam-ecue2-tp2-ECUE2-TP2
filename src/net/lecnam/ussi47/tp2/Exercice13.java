package net.lecnam.ussi47.tp2;

public class Exercice13 {

    public static void main(String[] args) {

        int unNombre = java.util.concurrent.ThreadLocalRandom.current().nextInt(0,9);
        int factoriel = 1;

        for (int i = 1; i <= unNombre; i++) {
            factoriel *= i;
        }

        System.out.println("Le factoriel de " + unNombre + " est : " + factoriel);
    }
}
