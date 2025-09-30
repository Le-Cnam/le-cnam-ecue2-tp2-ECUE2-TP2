package net.lecnam.ussi47.tp2;

public class Exercice12 {

    public static void main(String[] args) {
        String[] voyelles = {"a", "e", "i", "o", "u", "y"};
        String phrase = "cette phrase contient 11 voyelles";
        int compteur = 0;

        for (int i = 0; i < phrase.length(); i++) {
            String lettre = String.valueOf(phrase.charAt(i));
            for (String v : voyelles) {
                if (lettre.equals(v)) {
                    compteur++;
                    break;
                }
            }
        }
        System.out.println("Nombre de voyelles : " + compteur);
    }
}
