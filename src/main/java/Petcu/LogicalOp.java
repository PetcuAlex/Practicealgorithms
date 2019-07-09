package Petcu;



import java.util.Scanner;

public class LogicalOp {

    private void showNumbers() {

        Scanner in = new Scanner(System.in);
        System.out.println("Count to 100: ");
        System.out.println();
        System.out.println("Enter your number: ");
        int startingNumber = in.nextInt();
        if (startingNumber >= 100) {
            System.out.println("Your number must be lower then 100");
        } else {
            for (int i = startingNumber; i <= 100; i++) {
                System.out.println(i);
            }
        }

    }

    private void countNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Count to -100");
        System.out.println();
        System.out.println("Enter your number: ");
        int startingNumber = in.nextInt();
        if (startingNumber <= -100) {
            System.out.println("Your number must be higher then -100");
        } else {
            for (int i = startingNumber; i >= -100; i--) {
                System.out.println(i);
            }
        }
    }

    private void numbersBetween() {
        Scanner in = new Scanner(System.in);
        System.out.println("Show numbers between two numbers:");
        System.out.println();
        System.out.println("Enter first number: ");
        int firstNumber = in.nextInt();
        System.out.println("Enter last number: ");
        int lastNumber = in.nextInt();
        if (firstNumber < lastNumber) {
            for (int i = firstNumber; i <= lastNumber; i++) {
                System.out.println(i);
            }
        } else if (firstNumber > lastNumber) {
            for (int i = lastNumber; i <= firstNumber; i++) {
                System.out.println(i);
            }
        } else System.out.println("Your numbers are equal! ");
    }

    private void evenNumbers() {
        System.out.println("Even numbers from 1 to 100");
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }

    }

    private void oddNumbers() {
        System.out.println("Odd numbers from 1 to 100");
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }

    }

    private void sumNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Sum from number to 100");
        System.out.println();
        System.out.println("Enter your number: ");
        int number = in.nextInt();
        if (number > 100) {
            System.out.println("Your number is bigger than 100");
        } else {
            int sum = 0;
            for (int i = number; i <= 100; i++) {
                sum = sum + i;
            }
            System.out.println("Your sum is: " + sum);
        }


    }

    private void averageNumbers() {

        Scanner in = new Scanner(System.in);
        System.out.println("Average from number to 100");
        System.out.println();
        System.out.println("Enter you number: ");
        double number = in.nextInt();
        double sum = 0;
        double totalNumbers = 0;
        for (double i = number; i <= 100; i++) {
            sum = sum + i;
            totalNumbers++;
        }
        double average = sum / totalNumbers;
        System.out.println(average);

    }

    private void showPattern() {
        System.out.println("Show pattern:");
        System.out.println();
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {

        LogicalOp logicalOp = new LogicalOp();
        logicalOp.showNumbers();
        logicalOp.countNumbers();
        logicalOp.numbersBetween();
        logicalOp.evenNumbers();
        logicalOp.oddNumbers();
        logicalOp.sumNumbers();
        logicalOp.averageNumbers();
        logicalOp.showPattern();
    }
}


