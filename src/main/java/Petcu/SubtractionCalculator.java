package Petcu;

import java.util.Scanner;

public class SubtractionCalculator {




    public void displaySubtraction(){

        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers: ");
        double numbers = in.nextDouble();
        System.out.println("Enter your number:");
        double number = in.nextDouble();
        double subtraction = number;
        for(int i = 1; i < numbers ;i++){

            System.out.println("Enter your number:");
             number = in.nextDouble();
            subtraction = subtraction - number;

        }
        System.out.println("Your subtraction is: " + subtraction);

    }
    public void displaySubtraction(int a , int b){

        int subtraction = a-b;
        System.out.println("Subtraction result is: " + subtraction);

    }



    public static void main(String[] args) {

        SubtractionCalculator subtractionCalculator = new SubtractionCalculator();
        subtractionCalculator.displaySubtraction();
        subtractionCalculator.displaySubtraction(10,3);

    }

}
