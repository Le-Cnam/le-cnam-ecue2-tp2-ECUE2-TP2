package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {

        int puissance = 500;
        float surface = 8.3f;
        float surfacepiece = 3.40f * 4.3f*2.3f;

        float puissancetot = puissance * surfacepiece/surface;
        float nbradiateur = puissancetot / 500;
        nbradiateur = (float)Math.ceil(nbradiateur);
        System.out.println("Le nombre de radiateur nécessaires est : " + nbradiateur);



    }
}
