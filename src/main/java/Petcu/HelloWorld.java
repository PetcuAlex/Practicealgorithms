package Petcu;

import java.util.Scanner;

public class HelloWorld {

    private void sayHello() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = in.next();
        System.out.println("What langguage ?");
        String language = in.next();
        switch (language) {
            case "romanian":
                System.out.println("Buna, " + name + " ma bucur sa te cunosc!");
                break;
            case "english":
                System.out.println("Hello, "+ name + " I'm glad to meet you!");
                break;
            case "french":
                System.out.println("Bonjour, "+ name +" je suis content de vous rencontrer!");
                break;
            case "italian":
                System.out.println("Buna, " + name + " ma bucur sa te cunosc!");
                break;
            case "spanish":
                System.out.println("Hola. " + name + "  me alegro de conocerte");
                break;
            case "german":
                System.out.println("Hallo, "  + name + " ich freue mich, Sie kennenzulernen");
                break;
            default:
                System.out.println("I don't know your language!");

        }


    }


    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();


    }
}


