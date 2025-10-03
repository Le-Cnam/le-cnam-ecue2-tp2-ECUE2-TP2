package net.lecnam.ussi47.tp2;
import java.util.concurrent.ThreadLocalRandom;
public class Exercice7 {

    public static void main(String[] args) {
        int x = ThreadLocalRandom.current().nextInt(1,101);
        System.out.println(x);
        if (x%2==0){
            System.out.println("c'est pair");
        }
        else {
            System.out.println("c'est impair");
        }
    }
}
