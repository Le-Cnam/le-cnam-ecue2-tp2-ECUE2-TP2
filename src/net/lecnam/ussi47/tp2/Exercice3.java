package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {

        float surface = 1.25f;
        float nbcarré = 4;
        float nbplante = 9;

        float surfcultivée = surface * surface * nbcarré;
        System.out.println(surfcultivée);

        float nbtotal = nbplante * nbcarré;
        System.out.println(nbtotal);

        float surparplante = surfcultivée / nbtotal;
        System.out.println(surparplante);
    }
}
