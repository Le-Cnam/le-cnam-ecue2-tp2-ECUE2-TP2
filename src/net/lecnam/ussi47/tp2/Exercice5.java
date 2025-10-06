package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {
        //Un radiateur de 500W chauffe 8m3,
        //combien faut-il de radiateurs pour chauffer une pièce de 3,40 x 4,30 x 2,30
        float longPiece = 3.40f ;
        float largPiece = 4.30f ;
        float hautPiece = 2.30f ;
        float metresCube = longPiece * largPiece * hautPiece ;

        int nbRadiateur = 0 ;
        while (metresCube > 0) {
            nbRadiateur++ ;
            metresCube -= 8 ;
        }
        System.out.println("il faut : " + nbRadiateur + " radiateurs");
    }
}
