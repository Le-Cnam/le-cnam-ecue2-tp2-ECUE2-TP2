package net.lecnam.ussi47.tp2;

public class Exercice12 {

    public static void main(String[] args) {
                String phrase = "cette phrase contient 11 voyelles";

                String voyelles = "aeiouyAEIOUY";
                int compteur = 0;

                for (char lettre : phrase.toCharArray()) {
                    if (voyelles.indexOf(lettre) != -1) {
                        compteur++;
                    }
                }
                System.out.println("Le nombre de voyelles dans la phrase est : " + compteur);
            }
        }

