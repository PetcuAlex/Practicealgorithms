package Petcu;

import java.util.Scanner;

public class SelfCheckout {

    private void checkOut() {

        Scanner in = new Scanner(System.in);
        System.out.println("How many items?");
        int items = in.nextInt();
        double subTotal = 0;
        boolean validate;
        double price = 0;
        double quantity = 0;
        for (int i = 1; i <= items; i++) {
            do {
                System.out.println("Enter the price of item " + i + ":");
                if (in.hasNextDouble()) {
                    price = in.nextDouble();
                    validate = true;
                } else {
                    System.out.println("You must enter a number!");
                    validate = false;
                    in.next();
                }
            } while (!(validate));
            do {
                System.out.println("Enter the quantity of item " + i + ":");
                if (in.hasNextInt()) {
                    quantity = in.nextDouble();
                    validate = true;
                } else {
                    System.out.println("You must enter a number!");
                    validate = false;
                    in.next();
                }
            } while (!(validate));

            subTotal = (price * quantity) + subTotal;

        }
        System.out.println("Subtotal : " + "$" + subTotal);
        double tax = 5.5 / 100 * subTotal;
        System.out.println("Tax: " + "$" + tax);
        double Total = subTotal + tax;
        System.out.println("Total: " + "$" + Total);

    }


    public static void main(String[] args) {
        SelfCheckout selfCheckout = new SelfCheckout();
        selfCheckout.checkOut();

    }
}
