package net.lecnam.ussi47.tp2;

public class Exercice12 {

    public static void main(String[] args) {
        String phrase = "cette phrase contient 11 voyelles" ;
        String voyelles = "aeiouy" ;
        int compteur = 0 ;
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (voyelles.indexOf(c) != -1) {
                compteur++;
            }
        }
        System.out.println("Il y a " + compteur + " voyelles");
    }
}
