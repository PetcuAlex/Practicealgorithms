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
    public void  displayMultiplication(int a, int b){

        int multiplication = a * b;
        System.out.println("Your result is: " + multiplication);

    }

    public static void main(String[] args) {

        MultiplicationCalculator multiplicationCalculator = new MultiplicationCalculator();
        multiplicationCalculator.displayMultiplication();
        multiplicationCalculator.displayMultiplication(10,3);

    }
}
