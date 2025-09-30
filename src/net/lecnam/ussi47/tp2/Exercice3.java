package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        float cote = 1.25f;
        float surface = cote*cote;
        byte nbJardin = 4;
        byte plantes = 9;
        float surfaceTot = surface * nbJardin;
        System.out.println("la surface tot = " + surfaceTot);
        int plantesTot = plantes * nbJardin;
        System.out.println("le nombre de plantes tot = " + plantesTot);
        float surfaceParPlante = surfaceTot/plantesTot;
        System.out.println("la surface parte tot = " + surfaceParPlante);
    }
}
