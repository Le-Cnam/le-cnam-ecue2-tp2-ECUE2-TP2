package net.lecnam.ussi47.tp2;

public class Exercice2 {

    public static void main(String[] args) {
        //Montrer que le theorème de pytagore est vrai avec un triangle rectangle de côté :
        // 3, 4 et 5
        // pytagore : a² + b² = c²
        byte coteA = 3 ;
        byte coteB = 4 ;
        byte coteC = 5 ;
        if (coteA * coteA + coteB * coteB == coteC * coteC) {
            System.out.println("pytagore");
        }
        else {
            System.out.println("pas pytagore");
        }
    }
}

