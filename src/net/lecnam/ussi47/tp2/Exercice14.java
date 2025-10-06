package net.lecnam.ussi47.tp2;

public class Exercice14 {

    public static void main(String[] args) {
    //Ecrire un programme qui répond Vrai si une phrase est un palindrome et faux dans le cas contraire.
    //idee, retourner le str, et comparer sans case
    String phrase = "Esope reste ici et se repose" ;
    String phraseSansEspace = phrase.replace(" ", "") ;
    String phraseReverse ;
    StringBuilder strb = new StringBuilder(phraseSansEspace);
    phraseReverse = strb.reverse().toString();
    if (phraseReverse.equalsIgnoreCase(phraseSansEspace)) {
        System.out.println("\"" + phrase + "\" est un palindrome");
    }  else {
        System.out.println("\"" + phrase + "\" n'est pas un palindrome");
    }
    }
}
