package net.lecnam.ussi47.tp2;

public class Exercice6 {

    public static void main(String[] args) {

        // Sachant que ThreadLocalRandom.current().nextInt(0,2) retourne 1 ou 0,
        // écrire un programme qui affiche true si 1 ou false si 0 selon le résultat retourné.

        int randomValue = java.util.concurrent.ThreadLocalRandom.current().nextInt(0, 2);
        boolean result = (randomValue == 1);
        System.out.println("Random Value: " + randomValue);
        System.out.println(result);

    }
}
