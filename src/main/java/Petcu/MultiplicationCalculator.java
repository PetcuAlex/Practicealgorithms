package Petcu;

import java.util.Scanner;

public class MultiplicationCalculator {


    public void displayMultiplication(){

        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers?:");
        double numbers = in.nextDouble();
        double multiplication = 1;
        for(int i = 0;i < numbers; i++){

            System.out.println("Enter number:");
            double number = in.nextDouble();
            multiplication = number * multiplication;

        }
        System.out.println("Your multiplication is: " + multiplication);



    }

    public static void main(String[] args) {

        MultiplicationCalculator multiplicationCalculator = new MultiplicationCalculator();
        multiplicationCalculator.displayMultiplication();

    }
}
