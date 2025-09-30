package net.lecnam.ussi47.tp2;

public class Exercice16 {

    public static void main(String[] args) {

        int hauteurSapin = 5;

        // i pour les lignes
        // j pour les colonnes

        for (int i = 0; i <= hauteurSapin; i++) {
            for (int j = 1; j <= (hauteurSapin - i); j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                if (j == 1 || j == (2 * i + 1) || i == hauteurSapin) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
}
