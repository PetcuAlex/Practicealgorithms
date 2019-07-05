package Petcu;

import java.util.Scanner;

public class BloodAlcoholCalculator {

    private void calculateAlcohol(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your weight");
        double weight = in.nextDouble();
        System.out.println("Enter your gender:");
        String gender = in.next();
        System.out.println("Enter your number of drinks you consumed:");
        int drinksNumber = in.nextInt();
        System.out.println("Enter amount of alcohol by volume:");
        double alcoholVolume = in.nextDouble();
        System.out.println("Enter the amount of time since your last drink in hours:");
        double hours = in.nextDouble();
        double bac = 0;
        if (gender.equalsIgnoreCase("male")){
            bac = ((drinksNumber * alcoholVolume/100)*5.14 /(weight * 0.73))- .015 * hours;
        }else if (gender.equalsIgnoreCase("female")){
            bac = ((drinksNumber * alcoholVolume/100)*5.14 /(weight * 0.66))- .015 * hours;
        }
        System.out.println(bac);



    }




    public static void main(String[] args) {
        BloodAlcoholCalculator bloodAlcoholCalculator = new BloodAlcoholCalculator();
        bloodAlcoholCalculator.calculateAlcohol();
    }
}
