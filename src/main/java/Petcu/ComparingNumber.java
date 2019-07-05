package Petcu;

import java.util.Scanner;

public class ComparingNumber {

    private void compareNumber() {
        Scanner in = new Scanner(System.in);
        double x,y,z;
        do {
            System.out.println("Enter 3 different numbers.");
            System.out.println("Enter a number1:");
            x = in.nextDouble();
            System.out.println("Enter a number2:");
            y = in.nextDouble();
            System.out.println("Enter a number3:");
            z = in.nextDouble();

        } while (x == y || x == z || y == z);
        if (x > y & x > z)
            System.out.println("The largest number is " + x);
        else if (y > x & y > z)
            System.out.println("The largest number is " + y);
        else if (z > x & z > y)
            System.out.println("The largest number is " + z);
    }


    public static void main(String[] args) {
        ComparingNumber comparingNumber = new ComparingNumber();
        comparingNumber.compareNumber();
    }
}
