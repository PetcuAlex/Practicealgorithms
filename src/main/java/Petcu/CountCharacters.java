package Petcu;

import java.util.Scanner;

public class CountCharacters {

    private void countCharacters() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = in.nextLine();
        System.out.println(word + " has " + word.length() + " characters.");

    }






    public static void main(String[] args) {
        CountCharacters countCharacters = new CountCharacters();
        countCharacters.countCharacters();

    }
}
