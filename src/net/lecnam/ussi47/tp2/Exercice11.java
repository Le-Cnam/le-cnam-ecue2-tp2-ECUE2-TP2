package net.lecnam.ussi47.tp2;

public class Exercice11 {

    public static void main(String[] args) {
        String texte = "CNAM";
        String resultat = texte.charAt(0) + texte.substring(1).toLowerCase();
        System.out.println(resultat);
    }
}
