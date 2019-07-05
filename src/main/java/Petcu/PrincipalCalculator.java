package Petcu;

import java.util.Scanner;

public class PrincipalCalculator {

    private void calculateInterest() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal:");
        double principal = in.nextDouble();
        System.out.println("Enter rate of interest:");
        double interestRate = in.nextDouble();
        System.out.println("Enter the number of years");
        int years = in.nextInt();
        double worth = principal * (1 + (interestRate / 100) * years);
        worth = Math.round(worth * 100) / 100.0;
        System.out.println("After " + years + " years at " + interestRate + "%, the investment will be worth $" + worth);

    }


    public static void main(String[] args) {
        PrincipalCalculator calculateInterest = new PrincipalCalculator();
        calculateInterest.calculateInterest();
    }
}
