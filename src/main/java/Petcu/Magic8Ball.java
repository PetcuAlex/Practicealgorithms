package Petcu;

import java.util.Arrays;
import java.util.Scanner;

public class Magic8Ball {

    private void say(){

        Scanner in = new Scanner(System.in);

        int test = 0;
        String[] response = {"No","Yes","Maybe","Ask again later"};
        do {
            System.out.println("What's your questions?");
            String question = in.nextLine();
            int randomize = (int) (Math.random() * ((3) + 1));
            System.out.println(response[randomize]);
            test++;

        }while (test!=20);


    }


    public static void main(String[] args) {
        Magic8Ball magic8Ball = new Magic8Ball();
        magic8Ball.say();
    }
}
