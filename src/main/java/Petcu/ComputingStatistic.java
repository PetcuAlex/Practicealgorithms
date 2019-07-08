package Petcu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComputingStatistic {

    private void calculate() {

        Scanner in = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        double count = 0;
        double sum = 0;
        double average = 0;
        double standardDeviation= 0;

        while (true) {
            System.out.println("Enter a number:");
            double number = in.nextInt();
            numbers.add(number);
            count++;
            if (number == 50) {
                numbers.remove(numbers.size() - 1);
                System.out.println(numbers);

                break;

            }


        }
        for (Double mark : numbers) {
            sum += mark;
        }

        average = sum / numbers.size();
        System.out.println("The average is " + average);
        System.out.println("The minimum is  " + Collections.min(numbers));
        System.out.println("The biggest is " + Collections.max(numbers));

        for(double num: numbers) {
            standardDeviation += Math.pow(num - average, 2);
        }
        System.out.println("The standard deviation is: " + Math.sqrt(standardDeviation/numbers.size()));


    }


    public static void main(String[] args) {

        ComputingStatistic computingStatistic = new ComputingStatistic();
        computingStatistic.calculate();

    }
}
