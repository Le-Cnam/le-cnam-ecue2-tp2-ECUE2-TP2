package net.lecnam.ussi47.tp2;

public class Exercice7 {

    public static void main(String[] args) {
        // Sachant que ThreadLocalRandom.current().nextInt(1,101) retourne un chiffre entre 1 et 100,
        // écrire un programme qui affiche Le nombre x est Pair ou Le nombre x est Impair selon le résultat retourné.

        int randomValue = java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 101);
        String result = (randomValue % 2 == 0) ? "Pair" : "Impair";
        System.out.println("Le nombre " + randomValue + " est " + result);

    }
}
