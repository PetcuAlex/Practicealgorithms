package Petcu;

import java.util.Scanner;

public class PasswordValidation {

    private void validatePassword() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = in.next();
        System.out.println("Enter your password:");
        String password = in.next();


        if (password.equals("25.07.18") & username.equals("Balenuta")) {
            System.out.println("Welcome! You are logged in as: " + username);
        } else {
            System.out.println("Password or username is incorrect!");

        }


    }


    public static void main(String[] args) {

        PasswordValidation passwordValidation = new PasswordValidation();
        passwordValidation.validatePassword();

    }
}
