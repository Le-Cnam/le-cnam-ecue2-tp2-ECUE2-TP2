package net.lecnam.ussi47.tp2;

public class Exercice2 {

    public static void main(String[] args) {
        byte a = 3;
        byte b = 4;
        byte c = 5;

        int aCarre = a * a;
        int bCarre = b * b;
        int cCarre = c * c;

        boolean res = (aCarre + bCarre == cCarre);

        System.out.println("Résultat : " + res);
    }
}
