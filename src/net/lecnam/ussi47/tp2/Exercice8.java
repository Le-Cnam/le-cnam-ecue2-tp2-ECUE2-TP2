package net.lecnam.ussi47.tp2;
import java.util.concurrent.ThreadLocalRandom;
public class Exercice8 {

    public static void main(String[] args) {
        int x = ThreadLocalRandom.current().nextInt(1900,2050);
        if ((x%400==0) || ((x%4==0)&(x%100!=0))) {
            System.out.println(x + " est bisextile");
        }
        else {
            System.out.println(x + " n'est pas bisextile");
        }

    }
}
