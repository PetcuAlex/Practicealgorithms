package Petcu;

import java.util.Scanner;

public class HelloWorld {

    private void sayHello() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = in.next();
        String language = in.next();
        System.out.println("Hello, " + name + " nice to meet you! ");

    }


    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();



    }
}


