package Petcu;

import java.util.Scanner;

public class Surpriza {

    private void megaSurpriza(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = in.next();
        System.out.println("Are you sad?");
        String sad =in.next();
        if(sad.equalsIgnoreCase("yes") | sad.equalsIgnoreCase("y")){
            System.out.println(name + " gets bataitaaaa");
        } else if(sad.equalsIgnoreCase("no")| sad.equalsIgnoreCase("n")){
            System.out.println("I love you, " + name);
        }
    }

    public static void main(String[] args) {
        Surpriza surpriza = new Surpriza();
        surpriza.megaSurpriza();
    }
}
                                    //RUN IT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!