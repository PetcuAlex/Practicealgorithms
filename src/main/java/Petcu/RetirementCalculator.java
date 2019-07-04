package Petcu;

import java.util.Calendar;
import java.util.Scanner;


public class RetirementCalculator {

    private void whenIRetire() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age = in.nextInt();
        System.out.println("Enter your retirement age: ");
        int retirementAge = in.nextInt();
        if (age >= retirementAge) {
            System.out.println("You can retire already");
        } else {
            int remainingYear = retirementAge - age;
            System.out.println("You have " + remainingYear + " years until you can retire.");
            int year = Calendar.getInstance().get(Calendar.YEAR);
            int retirementYear = year + remainingYear;
            System.out.println("It's year " + year + ", so you can retire in " + retirementYear);
        }
    }


    public static void main(String[] args) {
        RetirementCalculator retirementCalculator = new RetirementCalculator();
        retirementCalculator.whenIRetire();

    }
}
