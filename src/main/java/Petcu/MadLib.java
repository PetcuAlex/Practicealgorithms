package Petcu;

import java.util.Scanner;

public class MadLib {

    private void makeStory() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a noun:");
        String noun = in.next();
        System.out.println("Enter a verb:");
        String verb = in.next();
        System.out.println("Enter an adverb:");
        String adverb = in.next();
        System.out.println("Enter an adjective:");
        String adjective = in.next();
        System.out.println("Enter a noun:");
        String noun2 = in.next();
        System.out.println("Enter a verb:");
        String verb2 = in.next();
        System.out.println("Enter an adverb:");
        String adverb2 = in.next();
        System.out.println("Enter an adjective:");
        String adjective2 = in.next();
        System.out.println("Enter a noun:");
        String noun3 = in.next();
        System.out.println("Enter a verb:");
        String verb3 = in.next();
        System.out.println("Enter an adverb:");
        String adverb3 = in.next();
        System.out.println("Enter an adjective:");
        String adjective3 = in.next();
        System.out.println("Enter a noun:");
        String noun4 = in.next();
        System.out.println("Enter a verb:");
        String verb4 = in.next();
        System.out.println("Enter an adverb:");
        String adverb4 = in.next();
        System.out.println("Enter an adjective:");
        String adjective4 = in.next();
        System.out.println("Once upon a time there was a " + adjective + " " +noun + " that " + verb +" " +adverb);
        System.out.println("Her " + adjective2 + " " + noun2 + " " + " have to " + verb2 + " " + adverb2);
        System.out.println("So " + noun2 + " " + verb3 + " " + adverb3 + " " + " to save the " + adjective3 + " " + noun3);
        System.out.println("At the end they found the " + adjective4 + " " + noun4 + " " + "so all of them started to " + verb4 + " " + adverb4);
        System.out.println("THE END !");

    }


    public static void main(String[] args) {

        MadLib madLib = new MadLib();
        madLib.makeStory();

    }
}



//    Once upon a time there was a ugly Princess that sing fastly
//    Her easy cat  have to run quickly
//        So cat eat loudly  to save the clean cheese
//        At the end they found the deep flowers so all of them started to sleep slowly
//        THE END !

//    Once upon a time there was a sleepy fish that run hardly
//    Her beautiful penguin  have to smoke faster
//        So penguin fart perfectly  to save the red human
//        At the end they found the clear glass so all of them started to eat nicely
//        THE END !