package Petcu;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber {

    private void guesssNumber() {

        Scanner in = new Scanner(System.in);
        int randomNumber;
        int guesses = 1;
        int number;
        boolean validate = true;

        System.out.println("Let's play Gueess the Number.");
        System.out.println("Select dificuly level(1, 2 or 3):");
        int dificultyLevel = in.nextInt();

        switch (dificultyLevel) {

            case 1: {
                randomNumber = 1 + (int) (Math.random() * ((10 - 1) + 1));
                System.out.println("I have my number between 1 and 10.What's your guess?");
                do {
                    if (in.hasNextInt()) {
                        validate = true;
                        number = in.nextInt();
                        do {

                            if (number < randomNumber) {
                                System.out.println("too low");
                                number = in.nextInt();
                                guesses++;
                            } else if (number > randomNumber) {
                                System.out.println("Too high.");
                                number = in.nextInt();
                                guesses++;
                            }
                        } while (number != randomNumber);
                        System.out.println("You got it in " + guesses + " guesses.");

                    } else {
                        validate = false;
                        System.out.println("You need to enter a number.");
                        guesses++;
                        in.next();
                    }
                } while (!(validate));
                break;
            }
            case 2: {

                randomNumber = 1 + (int) (Math.random() * ((100 - 1) + 1));
                System.out.println("I have my number between 1 and 100.What's your guess?");
                do {
                    if (in.hasNextInt()) {
                        validate = true;

                        number = in.nextInt();
                        do {

                            if (number < randomNumber) {
                                System.out.println("too low");
                                number = in.nextInt();
                                guesses++;
                            } else if (number > randomNumber) {
                                System.out.println("Too high.");
                                number = in.nextInt();
                                guesses++;
                            }

                        } while (number != randomNumber);
                        System.out.println("You got it in " + guesses + " guesses.");
                    } else {
                        validate = false;
                        System.out.println("You need to enter a number.");
                        guesses++;
                        in.next();
                    }
                } while (!(validate));
                break;


            }
            case 3: {
                randomNumber = 1 + (int) (Math.random() * ((1000 - 1) + 1));
                System.out.println("I have my number between 1 and 1000.What's your guess?");
                do {
                    if (in.hasNextInt()) {
                        validate = true;
                        number = in.nextInt();
                        do {

                            if (number < randomNumber) {
                                System.out.println("too low");
                                number = in.nextInt();
                                guesses++;
                            } else if (number > randomNumber) {
                                System.out.println("Too high.");
                                number = in.nextInt();
                                guesses++;
                            }
                        } while (number != randomNumber);
                        System.out.println("You got it in " + guesses + " guesses.");
                    } else {
                        validate = false;
                        System.out.println("You need to enter a number.");
                        guesses++;
                        in.next();
                    }
                } while (!(validate));
                break;

            }
        }
        if(guesses ==1){
            System.out.println("You are a mind reader!");
        }else if(guesses>=2&guesses<=4){
            System.out.println("Most impressive");
        }else if(guesses>=4&guesses<=6){
            System.out.println("You can do better than that.");
        }else{
            System.out.println("Better luck next time!");
        }
    }


    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        guessTheNumber.guesssNumber();
    }
}
