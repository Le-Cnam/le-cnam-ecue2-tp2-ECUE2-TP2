package net.lecnam.ussi47.tp2;

import java.util.Scanner;

public class Exercice17 {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            System.out.println("Veuillez sélectionner le nombre d'étoile dans la base du sapin (entre 1 et 20) :");
            System.out.println("Pour quitter, taper une lettre");
            Scanner sc = new Scanner(System.in);
            try {
                int nbEtoiles = Integer.parseInt(sc.nextLine());
                if (nbEtoiles > 0 && nbEtoiles < 21) {
                    System.out.println("Dessin du sapin avec une base de " + nbEtoiles);

                    int largeur = 2 * nbEtoiles - 1;
                    for (int i = 1; i <= nbEtoiles; i++) {
                        int etoileNb = 2 * i - 1;
                        String sapin = "*".repeat(etoileNb);
                        int padding = largeur - sapin.length();
                        int padLeft = padding / 2;
                        int padRight = padding - padLeft;
                        System.out.println(" ".repeat(padLeft) + sapin + " ".repeat(padRight));
                    }
                    if (nbEtoiles > 2) {
                        String tronc = "*".repeat(nbEtoiles/4);
                        int lenTronc = nbEtoiles / 2;
                        for (int i = 0; i < lenTronc; i++) {
                            int padding = largeur - tronc.length();
                            int padLeft = padding / 2;
                            int padRight = padding - padLeft;
                            System.out.println(" ".repeat(padLeft) + tronc + " ".repeat(padRight));
                        }
                    }

                }
            } catch (Exception e) {
                break;
            }

            Thread.sleep(3000);

        }

    }
}
