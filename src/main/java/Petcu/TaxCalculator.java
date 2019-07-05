package Petcu;

import java.util.Scanner;

public class TaxCalculator {

    private void calculateTax(){
        Scanner in = new Scanner(System.in);
        System.out.println("What is order amount?");
        double amount = in.nextDouble();
        System.out.println("What is the state?");
        String state = in.next();
        double subTotal = amount;
        if(state.equalsIgnoreCase("WI") | state.equalsIgnoreCase("wisconsin")){
            double tax = (5.5/10);
            double total = subTotal + tax;
            System.out.println("The subtotal is $" + subTotal);
            System.out.println("The tax is $" + tax);
            System.out.println("The total is $" + total);
        }else
        System.out.println("The total is $" + subTotal);
    }


    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.calculateTax();

    }
}
