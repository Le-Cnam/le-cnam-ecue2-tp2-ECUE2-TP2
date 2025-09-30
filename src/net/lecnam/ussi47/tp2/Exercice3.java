package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        // Un jardinier amateur veut créer 4 carrés jardin de 1,25m x 1,25m.
        // Il peut planter 9 plantes par carré.
        // Ecrire un programme qui affiche la surface cultivée,
        // le nombre plantes cultivables et la surface par plante.

        float coteCarre = 1.25F;
        int nombreCarres = 4;
        int plantesParCarre = 9;

        float surfaceCultivee = coteCarre * coteCarre * nombreCarres;
        int nombrePlantesCultivables = plantesParCarre * nombreCarres;
        float surfaceParPlante = surfaceCultivee / nombrePlantesCultivables;

        System.out.println("Surface cultivée : " + surfaceCultivee + " m²");
        System.out.println("Nombre de plantes cultivables : " + nombrePlantesCultivables);
        System.out.println("Surface par plante : " + surfaceParPlante + " m²");

    }
}
