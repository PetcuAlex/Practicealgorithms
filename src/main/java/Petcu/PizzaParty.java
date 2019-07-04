package Petcu;

import java.util.Scanner;

public class PizzaParty {

    private  void numberSlices(){

        Scanner in = new Scanner(System.in);
        System.out.println("How many people?");
        int people = in.nextInt();
        System.out.println("How many pizzas?");
        int pizzas = in.nextInt();
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
