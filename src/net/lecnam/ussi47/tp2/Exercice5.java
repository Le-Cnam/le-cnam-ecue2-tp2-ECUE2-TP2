package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {
        short puissanceRadiateur = 500;
        short volumeChauffePour1Radiateur = 8;
        double volumePiece = 3.40 * 4.30 * 2.30;
        System.out.println("le volume de la pièce = " + volumePiece);
        double nombreRadiateur = volumePiece / volumeChauffePour1Radiateur;
        int nombreRadiateurArrondi = (int) Math.ceil(nombreRadiateur);
        System.out.println("nombre de radiateur nécessaire (arrondi au supérieur) = " + nombreRadiateurArrondi);
    }
}
