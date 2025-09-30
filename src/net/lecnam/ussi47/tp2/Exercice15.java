package net.lecnam.ussi47.tp2;

public class Exercice15 {

    public static void main(String[] args) {

        int hauteurSapin = 5;

        // i pour les lignes
        // j pour les colonnes

        /*
        for i in range(taille):
        espaces = ' ' * (taille - i - 1)
        etoiles = '*' * (2 * i + 1)
        print(espaces + etoiles)
         */

        for (int i = 0; i <= hauteurSapin; i++) {
            for (int j = 1; j <= (hauteurSapin - i) ; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print('*');
            }
            System.out.println();
        }


    }
}
