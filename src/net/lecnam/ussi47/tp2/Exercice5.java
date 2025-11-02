package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {
        float longeur = 3.4f ;
        float largeur = 4.3f ;
        float hauteur = 2.3f ;
        float surface = longeur*largeur*hauteur ;
        int surfaceRadiateur = 8 ;
        float radiateursNecessaires = surface/surfaceRadiateur ;
        System.out.println("Il faut " + radiateursNecessaires + " radiateurs pour une pièce de " + surface +" m2");

    }
}
