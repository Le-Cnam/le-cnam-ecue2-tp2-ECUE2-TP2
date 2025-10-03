package net.lecnam.ussi47.tp2;

public class Exercice12 {

    public static void main(String[] args) {
        String phrase = "cette phrase contient 11 voyelles" ;
        String voyelle = "aeiouy" ;
        int compteur = 0 ;
        for (int i = 0; i < phrase.length(); i++) {
            if (voyelle.contains(phrase.substring(i,i+1))){
                compteur++;
            }
        }
        System.out.println("il y a : " + compteur + " voyelles");
    }
}
