package Petcu;

import java.util.Scanner;

public class MultistateTaxCalculator {

    private void calculateTax() {

        Scanner in = new Scanner(System.in);
        double tax = 0;
        System.out.println("What is the order amount?");
        double amount = in.nextDouble();
        System.out.println("What state do you live in?");
        String state = in.next();
        if (state.equalsIgnoreCase("wisconsin") | state.equalsIgnoreCase("wi")) {
            System.out.println("Enter your county:");
            String county = in.next();
            if (county.equalsIgnoreCase("eau claire") | county.equalsIgnoreCase("ec")) {
                tax += 0.005 + 0.05;
                tax = Math.round(tax*100)/100.0;
                System.out.println("The tax is $"  + tax * amount);
            } else if (county.equalsIgnoreCase("dunn")) {
                tax += 0.004 + 0.05;
                tax = Math.round(tax*100)/100.0;
                System.out.println("The tax is $"  + tax * amount);
            } else {
                tax += 0.05;
                tax = Math.round(tax*100)/100.0;
                System.out.println("The tax is $"  + tax * amount);
            }
        } else if (state.equalsIgnoreCase("illinois")) {
            tax += 0.08;
            tax = Math.round(tax*100)/100.0;
            System.out.println("The tax is $"  + tax * amount);

        } else {
            tax += 0;
        }
        double total = amount + tax * amount;
        total = Math.round(total*100)/100.0;
        System.out.println("The total is $ " + total);


    }


    public static void main(String[] args) {
        MultistateTaxCalculator multistateTaxCalculator = new MultistateTaxCalculator();
        multistateTaxCalculator.calculateTax();
    }
}
