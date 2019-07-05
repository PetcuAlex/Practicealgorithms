package Petcu;

import java.util.Scanner;

public class NumbertoName {

    private void convertNumber() {

        Scanner in = new Scanner(System.in);
        int number = 0;
        System.out.println("Please enter a number.");
        do{ number = in.nextInt();


            switch (number) {
                case 1:
                    number = 1;
                    System.out.println("The name of the mount is January");
                    break;
                case 2:
                    number = 2;
                    System.out.println("The name of the mount is February");
                    break;
                case 3:
                    number = 3;
                    System.out.println("The name of the mount is March");
                    break;
                case 4:
                    number = 4;
                    System.out.println("The name of the mount is April");
                    break;
                case 5:
                    number = 5;
                    System.out.println("The name of the mount is May");
                case 6:
                    number = 6;
                    System.out.println("The name of the mount is June");
                    break;
                case 7:
                    System.out.println("The name of the mount is July");
                    number = 7;
                    break;
                case 8:
                    number = 8;
                    System.out.println("The name of the mount is August");
                    break;
                case 9:
                    number = 9;
                    System.out.println("The name of the mount is September");
                    break;
                case 10:
                    number = 10;
                    System.out.println("The name of the mount is October");
                    break;
                case 11:
                    number = 11;
                    System.out.println("The name of the mount is November");
                    break;
                case 12:
                    number = 12;
                    System.out.println("The name of the mount is December");
                    break;
                default:
                    System.out.println("Your number must be between 1 and 12.");
                    System.out.println("Enter another number:");


            }

    }while (number <1 || number  >12 );


    }


    public static void main(String[] args) {

        NumbertoName numbertoName = new NumbertoName();
        numbertoName.convertNumber();
        ;
    }
}

