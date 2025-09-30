package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        short ppc = 9;
        short nbc = 4;
        float largeurc = 1.25f;
        float surface = largeurc * largeurc * nbc;
        System.out.println(surface);
        int ttPlantes = ppc * nbc;
        System.out.println(ttPlantes);
        System.out.println(surface/ttPlantes);

    }
}
