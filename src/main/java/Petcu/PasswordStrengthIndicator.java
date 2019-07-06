package Petcu;

import java.util.Scanner;

public class PasswordStrengthIndicator {

    private void passwordStrength() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = in.next();


        if(password.length()<8 & password.length() != 0 & password.matches("[0-9]+")){
            System.out.println("Password " +password + " is a very weak password");
        }else if(password.length()<8 & password.length() != 0 & password.matches("[a-zA-z0-9]+"))
        {
            System.out.println("Password " +password + " is a  weak password");
        }else if ( password.matches("[0-9a-zA-Z]{8,}+")){
            System.out.println("Password " +password + " is a strong password");
        }else if (password.matches("[0-9a-zA-Z\\p{P}\\p{S}]{8,}+")){
            System.out.println("Password " +password + " is a very strong password");
        }

    }


    public static void main(String[] args) {
        PasswordStrengthIndicator passwordStrengthIndicator = new PasswordStrengthIndicator();
        passwordStrengthIndicator.passwordStrength();
    }
}
