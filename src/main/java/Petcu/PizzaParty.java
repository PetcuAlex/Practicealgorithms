package Petcu;

import java.util.Scanner;

public class PizzaParty {

    private void numberSlices() {

        Scanner in = new Scanner(System.in);
        boolean validate;
        int people = 0;
        int pizzas = 0;
        do {
            System.out.println("How many people?");
            if (in.hasNextInt()) {
                people = in.nextInt();
                validate = true;
            } else {
                System.out.println("Enter a whole number");
                validate = false;
                in.next();
            }
        } while (!(validate));


        do {
            System.out.println("How many pizzas?");
            if (in.hasNextInt()) {
                pizzas = in.nextInt();
                validate = true;
            } else {
                System.out.println("Please enter a whole number!");
                validate = false;
                in.next();
            }
        } while (!(validate));
        int slices = pizzas * 8;
        System.out.println("There are " + people + " people with " + pizzas + " pizzas.");
        int pieces = slices / people;
        System.out.println("Each person gets " + pieces + " pieces of pizza.");
        int leftPieces = slices - pieces * people;
        System.out.println("There are " + leftPieces + " leftover pieces.");

    }


    public static void main(String[] args) {

        PizzaParty pizzaParty = new PizzaParty();
        pizzaParty.numberSlices();

    }
}
