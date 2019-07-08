package Petcu;

import java.util.*;

public class PasswordGenerator {

    private void generatePassword(){

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String digit = "123456789";
        String specialKeys = "#$%&";
        String password = "";
        System.out.println("Enter the length of the password:");
        int length = in.nextInt();
        System.out.println("How many numbers?");
        int numbers = in.nextInt();
        System.out.println("How many special keys?");
        int special = in.nextInt();


        char[] text = new char[length];
        for(int i = 0;i<numbers;i++) {
            text[i] = digit.charAt(rand.nextInt(digit.length()));
        }
        for(int i = numbers;i<numbers+special;i++){
            text[i] = specialKeys.charAt(rand.nextInt(specialKeys.length()));
        }
        for (int i = special +numbers;i<length;i++){
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }

        for (int i = 0;i<text.length;i++){
            password += text[i];
        }
        System.out.println(password);




    }


    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        passwordGenerator.generatePassword();
    }
}
