package Petcu;

import java.util.Scanner;

public class BodyMassIndexCalculator {

    private void calculateBmi() {
        Scanner in = new Scanner(System.in);
        double height = 0;
        double weight = 0;
        boolean validate;

        do {
            System.out.println("Enter your height in meters:");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                validate = true;
            } else {
                System.out.println("You need to enter a valid number.");
                validate = false;
                in.next();
            }
        } while (!(validate));
        do {
            System.out.println("Enter your weight in kilograms");
            if (in.hasNextDouble()) {
                weight = in.nextDouble();
                validate = true;
            } else {
                System.out.println("You need to enter a valid number.");
                validate = false;
                in.next();
            }
        } while (!(validate));
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi + ".");
        if (bmi < 18.5) {
            System.out.println("You are underweight! You should see your doctor.");
        } else if (bmi > 25) {
            System.out.println("You are overweight! You should see your doctor.");
        } else {
            System.out.println("You are within the ideal weight range.");
        }


    }


    public static void main(String[] args) {
        BodyMassIndexCalculator bodyMassIndexCalculator = new BodyMassIndexCalculator();
        bodyMassIndexCalculator.calculateBmi();

    }
}
