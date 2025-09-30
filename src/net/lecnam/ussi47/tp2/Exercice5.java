package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {

        // Un radiateur de 500W chauffe 8m3,
        // combien faut-il de radiateurs pour chauffer une pièce de 3,40 x 4,30 x 2,30

        float longueur = 3.40F;
        float largeur = 4.30F;
        float hauteur = 2.30F;

        float volume = longueur * largeur * hauteur;

        int puissanceRadiateur = 500; // en W
        int volumeChauffeParRadiateur = 8; // en m3

        int nombreRadiateurs = (int) Math.ceil(volume / volumeChauffeParRadiateur);

        System.out.println("Volume de la pièce : " + volume + " m³");
        System.out.println("Nombre de radiateurs nécessaires : " + nombreRadiateurs);

    }
}
