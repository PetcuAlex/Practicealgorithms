package Petcu;

import java.util.Scanner;

public class NumberCheck {

    private void compareNumbers(){

        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a number:");
        a=in.nextInt();
        System.out.println("Enter a number:");
        b=in.nextInt();
        System.out.println("Enter a number:");
        c=in.nextInt();

        if (a == b & a ==b & b==c){
            System.out.println("All numbers are equal.");
        }else if (a!=b & a!=c & b!=c){
            System.out.println("All numbers are different.");
        }else System.out.println("Neither all are different or equal.");


    }


    public static void main(String[] args) {
        NumberCheck numberCheck = new NumberCheck();
        numberCheck.compareNumbers();
    }
}
