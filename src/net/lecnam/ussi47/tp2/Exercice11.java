package net.lecnam.ussi47.tp2;

public class Exercice11 {

    public static void main(String[] args) {
        //Convertir CNAM en Cnam et afficher la chaine.
        //Pas de triche, ça doit fonctionner si on change CNAM en DGAC.
        String cnam = "cNAm" ;
        System.out.println(cnam.substring(0,1).toUpperCase() + cnam.substring(1).toLowerCase());
    }
}
