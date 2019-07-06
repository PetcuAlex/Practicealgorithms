package Petcu;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidationInput {

    private void validate() {

        Scanner in = new Scanner(System.in);
        int errors=0;
        System.out.println("Enter the first name:");
        String firstName = in.next();
        System.out.println("Enter the last name:");
        String lastName = in.next();
        System.out.println("Enter the ZIP code");
        String zipCode = in.next();
        System.out.println("Enter the employee ID ");
        String employeeID = in.next();

        if (firstName.length() < 2 | !firstName.matches("[a-zA-z]+")) {
            System.out.println("'" + firstName + "' is not a valid name.Is too short.");
            errors++;
        }
        if (lastName.length() < 2 | !lastName.matches("[a-zA-z]+")) {
            System.out.println("'" + lastName + "' is not a valid name.Is too short.");
            errors++;
        }
        if (!zipCode.matches("[0-9]+")) {
            System.out.println("The ZIP code must be numeric.");
            errors++;
        }
        if (!employeeID.matches("[a-zA-z]{2}-\\d{4}")) {
            System.out.println(employeeID + " is not a valid ID format.");
            System.out.println("The ID format should be AA-1234(LetterLetter-NumberNumberNumberNumber)");
            errors++;
        }
        System.out.println("You have " + errors +" errors.");


    }


    public static void main(String[] args) {
        ValidationInput validationInput = new ValidationInput();
        validationInput.validate();
    }
}
