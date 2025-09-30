package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice13 {

    public static void main(String[] args) {
        int chiffre = ThreadLocalRandom.current().nextInt(0,9);
        System.out.println(chiffre);
        int i = 0;
        int res = 1;
        while(i < chiffre){
            res = res*(i+1);
            i++;
        }
        System.out.println(res);

    }
}
