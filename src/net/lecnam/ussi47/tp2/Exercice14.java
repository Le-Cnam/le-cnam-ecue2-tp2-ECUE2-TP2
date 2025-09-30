package net.lecnam.ussi47.tp2;

public class Exercice14 {

    public static void main(String[] args) {

        String unPalindrome = "Esope reste ici et se repose";

        // on supprime les espaces et on met en minuscule
        String unPalindromeModifie = unPalindrome.replace(" ", "").toLowerCase();

        String unPalindromeInverse = "";

        for (int i = unPalindromeModifie.length() - 1; i >= 0; i--) {
            unPalindromeInverse += unPalindromeModifie.charAt(i);
        }

        if (unPalindromeModifie.equals(unPalindromeInverse)) {
            System.out.println("La chaine est un palindrome");
        } else {
            System.out.println("La chaine n'est pas un palindrome");
        }
    }
}
