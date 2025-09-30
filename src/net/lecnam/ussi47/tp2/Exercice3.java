package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
    int nbCarre = 4 ;
    float cote = 1.25f ;
    float surface = cote*cote ;
    float surfaceTotale = surface*nbCarre ;
    int plantes = 9*nbCarre ;
    float surfacePlante = surfaceTotale/plantes ;
    System.out.println("La surface cultivée est de " + surfaceTotale + " m2") ;
    System.out.println("La surface par plante est de " + surfacePlante + " m2") ;
    System.out.println("Le nombre de plantes est de " + plantes) ;
    }
}
