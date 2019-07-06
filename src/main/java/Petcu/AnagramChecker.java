package Petcu;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    private void isAnagram() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings and I will tell you if they are anagrams.");
        System.out.println("Enter the first string:");
        String word1 = in.nextLine();
        System.out.println("Enter the second string:");
        String word2 = in.nextLine();
        String copyWord1 = word1.replaceAll("\\s", "");
        String copyWord2 = word2.replaceAll("\\s", "");
        boolean validation = true;
        if (copyWord1.length() != copyWord2.length()) {
            validation = false;
        } else {
            char[] word1Array = copyWord1.toLowerCase().toCharArray();
            char[] word2Array = copyWord2.toLowerCase().toCharArray();
            Arrays.sort(word1Array);
            Arrays.sort(word2Array);
            validation = Arrays.equals(word1Array, word2Array);
        }
        if (validation) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        }else{
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
        }

    }


    public static void main(String[] args) {
        AnagramChecker anagramChecker = new AnagramChecker();
        anagramChecker.isAnagram();
        ;
    }
}
