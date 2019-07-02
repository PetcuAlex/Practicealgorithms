package Petcu;


import java.awt.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class AverageCalculator {

    public void displayAverage() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers?");
        double numbers = in.nextDouble();
        double sum = 0;
        for (int i = 0; i < numbers; i++)
        {
            System.out.println("Enter number:");
            double number = in.nextDouble();
            sum = sum + number;
        }
        double average = sum / numbers;
        System.out.println("Your average is: " + average );


    }
    public void displayAverage(int a ,int b , int c){

        int average = (a + b + c) / 3;
        System.out.println("Yout average is: " + average);

    }

    public static void main(String[] args) {

        AverageCalculator averageCalculator = new AverageCalculator();
        averageCalculator.displayAverage();
        averageCalculator.displayAverage(1,2,3);

    }
}