package Petcu;

import java.util.Scanner;

public class DivisionCalculator {

    public void displaySubtraction(){

        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers: ");
        double numbers = in.nextDouble();
        System.out.println("Enter your number:");
        double number = in.nextDouble();
        double divison = number;
        for(int i = 1; i < numbers ;i++){

            System.out.println("Enter your number:");
            number = in.nextDouble();
            divison = divison / number;

        }
        System.out.println("Your division is: " + divison);

    }

    public void displayDivison(int a , int b){

        int division = a / b;
        System.out.println("Yout result is: " + division);

    }

    public static void main(String[] args) {

        DivisionCalculator divisionCalculator = new DivisionCalculator();
        divisionCalculator.displaySubtraction();
        divisionCalculator.displayDivison(10,2);

    }


}
