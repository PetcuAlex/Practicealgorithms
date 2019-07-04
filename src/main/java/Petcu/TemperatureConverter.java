package Petcu;

import java.util.Scanner;

public class TemperatureConverter {

    private void convertTempreture(){

        Scanner in = new Scanner(System.in);
        System.out.println("Press 1 to convert from Fahrenheit to Celsius");
        System.out.println("Press 2 to convert from Celsius to Fahrenheit");
        int unit = in.nextInt();
        System.out.println("Your choice is :" + unit);



        if(unit == 1){
            System.out.println("Enter your temperature in Fahrenheit: ");
            double value = in.nextDouble();
            double temperature = (value - 32) * 5 / 9;
            System.out.println("Your temperature in Celsius is " + temperature);
        }else if (unit == 2){
            System.out.println("Enter your temperature in Celsius: ");
            double value = in.nextDouble();
            double temperature = (value * 9/5) + 32;
            System.out.println("Your temperature in Fahrenheit is " + temperature);
        }

    }


    public static void main(String[] args) {

        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.convertTempreture();
    }
}



