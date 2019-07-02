package Petcu;

import java.util.Scanner;

public class SumCalculator {

    public void displaySum(){

        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers?:");
        double numbers = in.nextDouble();
        double sum = 0;
        for(int i = 0;i < numbers; i++){

            System.out.println("Enter number:");
            double number = in.nextDouble();
            sum = number + sum;

        }
        System.out.println("Your sum is: " + sum);
    }

    public void  displaySum(int a, int b){

        int sum  = a + b;
        System.out.println("Your sum is: " + sum);

    }

    public static void main(String[] args) {

        SumCalculator sumCalculator = new SumCalculator();
        sumCalculator.displaySum();
        sumCalculator.displaySum(10,5);

    }

    }


