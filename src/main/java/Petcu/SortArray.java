package Petcu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortArray {

    private void sort() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of numeric array:");
        int lengthInt = in.nextInt();
        System.out.println("Enter length of string array:");
        int lengthString = in.nextInt();
        int[] intArr = new int[lengthInt];
        String[] stringArr = new String[lengthString];
        System.out.println("Enter numbers to add in array");
        for (int i = 0; i < lengthInt; i++) {
            intArr[i] = in.nextInt();
        }
        System.out.println("Enter words to enter in array");
        for (int j = 0; j < lengthString ; j++) {
            stringArr[j] = in.nextLine();
        }


        System.out.println("Original order: " + Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println("Sorted order: " + Arrays.toString(intArr));
        System.out.println("Original order: " + Arrays.toString(stringArr));
        Arrays.sort(stringArr);
        System.out.println("Sorted order: " + Arrays.toString(stringArr));


    }


    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        sortArray.sort();
    }
}
