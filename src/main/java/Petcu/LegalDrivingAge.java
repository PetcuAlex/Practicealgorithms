package Petcu;

import java.util.Scanner;

public class LegalDrivingAge {

    private void legalDriveAge() {

        Scanner in = new Scanner(System.in);
        int drivingAge = 18;
        int age = 0;
        boolean validate;
        do {
            System.out.println("Enter your age: ");
            if (in.hasNextInt()) {
                age = in.nextInt();
                validate = true;
            } else {
                System.out.println("Please enter a valid age!");
                validate = false;
                in.next();
            }

        } while (!(validate));
        if (age >= drivingAge) {
            System.out.println("You are old enough to legally drive!");
        } else {
            System.out.println("You are not old enough to legally drive!");
        }


    }


    public static void main(String[] args) {
        LegalDrivingAge legalDrivingAge = new LegalDrivingAge();
        legalDrivingAge.legalDriveAge();

    }
}
