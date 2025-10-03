package net.lecnam.ussi47.tp2;

public class Exercice15 {

    public static void main(String[] args) {
        int x = 5;
        int largeur = 2 * x - 1;
        for (int i = 1; i <= x; i++) {
            int etoileNb = 2 * i - 1;
            String sapin = "*".repeat(etoileNb);
            int padding = largeur - sapin.length();
            int padLeft = padding / 2;
            int padRight = padding - padLeft;
            System.out.println(" ".repeat(padLeft) + sapin + " ".repeat(padRight));
        }

    }
}
