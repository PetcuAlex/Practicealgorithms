package Petcu;

import java.util.Scanner;

public class PaintCalculator {

    private void calculatePaint() {
        Scanner in = new Scanner(System.in);
        boolean validate;
        double length = 0;
        double width = 0;
        do {
            System.out.println("Enter length of celling:");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                validate = true;
            } else {
                System.out.println("You need to enter a number!");
                validate = false;
                in.next();
            }
        } while (!(validate));
        do {
            System.out.println("Enter width of celling");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                validate = true;
            } else {
                System.out.println("You need to enter a number!");
                validate = false;
                in.next();
            }
        } while (!(validate));
        double area = length * width;
        double gallons = area / 350;
        gallons = Math.ceil(gallons);
        System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " + area + " square feet");


    }


    public static void main(String[] args) {
        PaintCalculator paintCalculator = new PaintCalculator();
        paintCalculator.calculatePaint();
    }
}
