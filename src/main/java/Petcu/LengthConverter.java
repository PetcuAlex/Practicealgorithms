package Petcu;

import java.util.Scanner;

public class LengthConverter {

    private void convert(){

        Scanner in = new Scanner(System.in);
        System.out.println("You want to enter inches or meters?");
        String unit = in.next();
        if (unit.equalsIgnoreCase("inches") ){
            System.out.println("How many inches you want to convert in meters?");
            double inches = in.nextDouble();
            double result = inches * 0.0254;
            System.out.println(inches +" inches to meters: " +result);
        }else if (unit.equalsIgnoreCase("meters")){
            System.out.println("How many meters you want to convert in inches?");
            double meters = in.nextDouble();
            double result = meters/0.0254;
            System.out.println(meters +" meters to inches: " +result);
        }




    }





    public static void main(String[] args) {

        LengthConverter lengthConverter = new LengthConverter();
        lengthConverter.convert();
    }
}
