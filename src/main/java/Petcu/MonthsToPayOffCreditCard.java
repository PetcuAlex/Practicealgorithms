package Petcu;


import java.util.Scanner;

import static java.lang.Math.log;

public class MonthsToPayOffCreditCard {

    private void monthstoPay() {

        Scanner in = new Scanner(System.in);
        System.out.println("What is your balance?");
        double balance = in.nextDouble();
        System.out.println("What is the APR on the card(as a percent)?");
        double apr = in.nextDouble() / 100;
        System.out.println("What is the monthly payment you can make?");
        double monthlyPayment = in.nextDouble();
        double dailyRate = apr / 365;
        double months = -0.03333333 * (Math.log(1 + balance / monthlyPayment * (1 - (Math.pow(1 + dailyRate, 30)))) / Math.log(1 + dailyRate));
        months = Math.ceil(months);
        System.out.println("It will take you " + months + "months to pay off this card");


    }


    public static void main(String[] args) {
        MonthsToPayOffCreditCard card = new MonthsToPayOffCreditCard();
        card.monthstoPay();
    }
}
