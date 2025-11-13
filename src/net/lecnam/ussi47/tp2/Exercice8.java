package net.lecnam.ussi47.tp2;
import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {
        int resultat = ThreadLocalRandom.current().nextInt(1900, 2050);
        System.out.println(resultat);
        if (resultat % 4 ==0 && resultat % 100 !=0 || resultat % 400 ==0) {
            System.out.println("l année  " +resultat +" est bissextile");
        }
        else {
            System.out.println("L année " +resultat +" n'est pas bissextile");
        }

    }
}
