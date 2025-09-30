package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {
        float volume = 3.40f * 4.30f * 2.30f;
        System.out.println(volume);
        float nbRadiateurs = (volume / 8);
        System.out.println(Math.ceil(nbRadiateurs));

    }
}
