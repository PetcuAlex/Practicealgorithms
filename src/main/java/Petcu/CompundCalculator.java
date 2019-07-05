package Petcu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CompundCalculator {

    private void calculateCompound() {

        Scanner in = new Scanner(System.in);
        System.out.println("What is the principal amount?");
        double principal = in.nextDouble();
        System.out.println("What is the rate?");
        double rate = in.nextDouble();
        System.out.println("What is the number of years?");
        int years = in.nextInt();
        System.out.println("What is the number of time the interest is compunded per year?");
        int compoundTimes = in.nextInt();
        double power = Math.pow((1 + ((rate / 100) / compoundTimes)), compoundTimes * years);
        double compound = principal * power;
        compound = Math.ceil(compound * 100) / 100.0;
        System.out.println((NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                .format(principal) + " invested at "+ rate + "% for " + years + " years compounded " + compoundTimes +
                " times per year is " + NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                .format(compound)));


    }


    public static void main(String[] args) {
        CompundCalculator compundCalculator = new CompundCalculator();
        compundCalculator.calculateCompound();
    }
}
