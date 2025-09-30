package net.lecnam.ussi47.tp2;

public class Exercice12 {

    public static void main(String[] args) {
        
        String listeVoyelles = "aeiouy";
        
        String unePhrase = "cette phrase contient 11 voyelles";
        
        int compteurVoyelles = 0;
        
        for (int i = 0; i < unePhrase.length(); i++) {
            char caractere = unePhrase.charAt(i);
            // si le caractere est une voyelle (on ignore la casse) on incrémente le compteur
            if (listeVoyelles.indexOf(Character.toLowerCase(caractere)) != -1) {
                compteurVoyelles++;
            }
        }
        
        System.out.println("Phrase : " + unePhrase);
        System.out.println("Nmbre de voyelles dans la chaine : " + compteurVoyelles);

    }
}
