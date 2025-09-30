package net.lecnam.ussi47.tp2;

public class Exercice4 {

    public static void main(String[] args) {

        // Les parachutistes sautent souvent à 4000 mètres.
        // Afficher le facture de conversion et calculer et afficher la hauteur en "pieds" ?

        int metres = 4000;
        float conversionMetresEnPieds = 3.28084F;
        float pieds = metres * conversionMetresEnPieds;

        System.out.println(metres + " mètres = " + pieds + " pieds");


    }
}
