package net.lecnam.ussi47.tp2;

public class Exercice2 {

    public static void main(String[] args) {

        // Pythagore avec 3, 4 et 5

        int sideA = 3;
        int sideB = 4;
        int sideC = 5;

        // aˆ2 + bˆ2 = cˆ2

        int aCarre = sideA * sideA;
        int bCarre = sideB * sideB;
        int cCarre = sideC * sideC;

        int result = aCarre + bCarre;

        if (result == cCarre) {
            System.out.println("Le triangle est rectangle");
        } else {
            System.out.println("Le triangle n'est pas rectangle");
        }


    }
}
