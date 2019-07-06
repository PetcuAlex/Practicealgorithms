package Petcu;

import java.util.Scanner;

public class DoubleInvestment {

    private void calculate(){

        Scanner in = new Scanner(System.in);
        double returnRate;
        boolean validate =false;
        do { System.out.println("What is the rate of return?");
        if(in.hasNextDouble()){
            returnRate = in.nextDouble();
            validate = true;
            double years = 72/returnRate;;
            System.out.println("In " + years +" years your investment will double.");

        }else{
            System.out.println("Sorry.That's not a valid input.");
            validate = false;
            in.next();

        }


        }while(!(validate));


    }


    public static void main(String[] args) {
        DoubleInvestment doubleInvestment = new DoubleInvestment();
        doubleInvestment.calculate();
    }
}
