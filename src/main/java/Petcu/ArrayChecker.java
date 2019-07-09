package Petcu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayChecker {

    private void findDuplicates() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int size = in.nextInt();
        boolean validate;
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        for (int j = 0; j < numbers.length - 1; j++) {
            for (int k = j + 1; k < numbers.length; k++) {
                if ((numbers[j] == numbers[k]) && (j != k)) {
                    int duplicate = numbers[k];
                    System.out.println("Dublicate elements: " + numbers[k]);
                    validate = true;
                } else {
                    validate = false;
                }

            }
        }
        if (validate = false) {
            System.out.println("There are no duplicates in your array.");

        }
    }


    private void findCommon() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of first array:");
        int lengthString = in.nextInt();
        String[] number = new String[lengthString];
        for (int i = 0; i < lengthString; i++) {
            System.out.println("Please enter number");
            number[i] = in.next();
        }
        System.out.println(Arrays.toString(number));
        System.out.println("Enter the length of second array:");
        int length2 = in.nextInt();
        String[] number2 = new String[length2];
        for (int j = 0; j < number2.length; j++) {
            System.out.println("Enter a number:");
            number2[j] = in.next();

        }

        HashSet<String> set = new HashSet<String>();

        for (int k = 0; k < number.length; k++) {
            for (int j = 0; j < number2.length; j++) {
                if (number[k].equals(number2[j])) {

                    set.add(number[k]);
                }

            }
        }
        if (set.isEmpty()) {
            System.out.println("There are no common elements.");
        } else {
            System.out.println("Common elements are: " + set);
        }
    }


    public static void main(String[] args) {
        ArrayChecker arrayChecker = new ArrayChecker();
        arrayChecker.findDuplicates();
        arrayChecker.findCommon();
    }
}
