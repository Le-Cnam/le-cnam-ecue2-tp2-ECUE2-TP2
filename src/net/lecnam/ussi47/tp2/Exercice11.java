package net.lecnam.ussi47.tp2;

public class Exercice11 {

    public static void main(String[] args) {

        String uneChaine = "CNAM";

        String uneChaineModifiee = uneChaine.charAt(0) + uneChaine.substring(1).toLowerCase();

        System.out.println(uneChaineModifiee);
    }
}
