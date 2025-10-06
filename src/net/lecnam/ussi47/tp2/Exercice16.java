package net.lecnam.ussi47.tp2;

public class Exercice16 {

    public static void main(String[] args) {
        int x = 8;
        int largeur = 2 * x - 1;
        for (int i = 1; i <= x; i++) {
            int etoileNb = 2 * i - 1;
            if (i == 1 || i == x) {
                String sapin = "*".repeat(etoileNb);
                int padding = largeur - sapin.length();
                int padLeft = padding / 2;
                int padRight = padding - padLeft;
                System.out.println(" ".repeat(padLeft) + sapin + " ".repeat(padRight));
            } else {
                String ligne = "*" + " ".repeat(etoileNb - 2) + "*";
                int padding = largeur - ligne.length();
                int padLeft = padding / 2;
                int padRight = padding - padLeft;
                System.out.println(" ".repeat(padLeft) + ligne + " ".repeat(padRight));
            }
        }
    }
}
