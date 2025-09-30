package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {
        double volumePiece = 3.40*4.30*2.30;
        byte surfaceRadiateur = 8;
        double nbRadiateur = volumePiece/surfaceRadiateur;
        int nbRadiateurEntier = (int) nbRadiateur;
        if (nbRadiateurEntier == nbRadiateur) {
            System.out.println("Nombre de radiateurs nécessaires: " + nbRadiateur);
        }
        else
            System.out.println("Nombre de radiateurs nécessaires: " + (nbRadiateurEntier+1));

    }
}
