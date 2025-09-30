package net.lecnam.ussi47.tp2;

public class Exercice8 {

    public static void main(String[] args) {

        /*
        Sachant qu'une année est bissextile si :

            si elle est divisible par 4 et non divisible par 100, ou
            si elle est divisible par 400.

        Determiner si la valeur retournée par ThreadLocalRandom.current().nextInt(1900,2050) est bissextile ou non
         */

        int annee = java.util.concurrent.ThreadLocalRandom.current().nextInt(1900, 2050);

        System.out.println("Year: " + annee);

        boolean isBissextile = (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);

        if (isBissextile) {
            System.out.println(annee + " est une année bissextile.");
        } else {
            System.out.println(annee + " n'est pas une année bissextile.");
        }


    }
}
