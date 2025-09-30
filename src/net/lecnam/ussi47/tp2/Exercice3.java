package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        //Un jardinier amateur veut créer 4 carrés jardin de 1,25m x 1,25m.
        //Il peut planter 9 plantes par carré. Ecrire un programme qui affiche
        //la surface cultivée, le nombre plantes cultivables et la surface par plante.
        float jardinLong = 1.25f ;
        float jardinLarg = 1.25f ;
        byte nbJardin = 4 ;
        byte nbPlanteParJardin = 9 ;
        // surface = long * larg * nbjardin
        // nb plante = nbplanteparjardin * nbjardin
        // surfaceparplante = nbplantetotal / surface
        float surface = jardinLarg * jardinLong * nbJardin ;
        System.out.println("Surface is " + surface);
        int nbPlanteTotal = nbPlanteParJardin * nbJardin;
        System.out.println("nbPlanteTotal is " + nbPlanteTotal);
        float surfaceParPlante = surface / nbPlanteTotal ;
        System.out.println("Surface by Plante is " + surfaceParPlante);
    }
}
