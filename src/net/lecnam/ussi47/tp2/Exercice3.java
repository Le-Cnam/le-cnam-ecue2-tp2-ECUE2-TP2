package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        float cote = 1.25f;
        byte planteParCarre = 9;
        byte nbCarre = 4;
        float surface = (cote*cote)*nbCarre;
        int plantesCultivables = planteParCarre*nbCarre;
        float surfaceParPlante = surface/plantesCultivables;
        System.out.println("Surface cultivée: " +surface);
        System.out.println("Plantes cultivable: " +plantesCultivables);
        System.out.println("Surface par plantes: " +surfaceParPlante);




    }
}
