package Petcu;

import java.util.Scanner;

public class CurencyConverter {

    private void convert() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        int euros = in.nextInt();
        System.out.println("What is the exchange rate?");
        double exchangeRate = in.nextDouble();
        double dollars = euros * exchangeRate;
        dollars = Math.round(dollars * 100) / 100.0;
        System.out.println(euros + " euros at an exchange rate of " + exchangeRate + " is " + dollars + " U.S dollars");
    }


    public static void main(String[] args) {
        CurencyConverter curencyConverter = new CurencyConverter();
        curencyConverter.convert();
    }
}
