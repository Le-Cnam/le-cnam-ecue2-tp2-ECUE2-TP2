package net.lecnam.ussi47.tp2;
import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {

        int random = ThreadLocalRandom.current().nextInt(1900,2050);

        if (random % 4 ==0 && random % 100 != 0 || random % 400 ==0){
            System.out.println(random + " est bisextile");
        }else
            System.out.println(random + " n'est pas bisextile");

    }
}
