package Petcu;

import java.util.Scanner;

public class FilterValues {

    private void filterArray() {

        Scanner in = new Scanner(System.in);
        int elements = 0;
        System.out.println("How many numbers you want in your array?");
        elements = in.nextInt();
        int[] numbers = new int[elements];
        System.out.println("Enter your numbers separated with spaces");
        for (int i = 0; i < elements; i++) {
            numbers[i] = in.nextInt();
        }
        System.out.println("Odd numbers:");
        for (int i = 0; i < elements; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("Even numbers:");
        for (int i = 0; i < elements; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

    }


    public static void main(String[] args) {
        FilterValues filterValues = new FilterValues();
        filterValues.filterArray();

    }

}

