package Petcu;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeartRate {

    private void calculateHR(){

        Scanner in = new Scanner(System.in);
        System.out.println("Resting Pulse: ");
        int pulse = in.nextInt();
        System.out.println("Age: ");
        int age = in.nextInt();
        double rate;
        String format = "|%1$-10s|%2$-10s|\n";
        String ex[] = {"Intensity","Rate"};
        System.out.format(String.format(format, (Object[]) ex));
        System.out.println("|----------|-----------|");
        for( int intensity = 55; intensity<=95; intensity+=5){
            rate = (((220 - age)- pulse) * intensity/100)+ pulse;
            String format2 = "|%1$-10s|%2$-10s|\n";
            String intensityString = Integer.toString(intensity);
            String rateString = Double.toString(rate);
            String ex2[] = { intensityString, rateString};

            System.out.format(String.format(format2, (Object[]) ex2));


        }



    }


    public static void main(String[] args) {
        HeartRate heartRate =new HeartRate();
        heartRate.calculateHR();
    }
}
