package net.lecnam.ussi47.tp2;

public class Exercice14 {
    public static void main(String[] args) {
        String phrase = "Esope reste ici et se repose"; // exemple à remplacer
        String clean = phrase.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        System.out.println(clean.equals(reversed));
    }
}