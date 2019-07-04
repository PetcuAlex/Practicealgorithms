package Petcu;

import java.util.Scanner;



public class AreaCalculator {

    private void calculateArea(){

        Scanner in = new Scanner(System.in);
        System.out.println("Press 1 to convert from feet to meters");
        System.out.println("Press 2 to convert from meters to feet");
        int unit = in.nextInt();
        if(unit ==1) {
            System.out.println("What is the length of the room in feet?: ");
            double feetLength = in.nextDouble();
            System.out.println("What is the width of the room in feet?: ");
            double feetWidth = in.nextDouble();
            System.out.println("You entered dimensions of " + feetLength + " feet by " + feetWidth + " feet.");
            double feetArea = feetLength * feetWidth;
            System.out.println("The area is " + feetArea + " square feet.");
            double metersArea = feetArea * 0.09290304;
            System.out.println("The are is " + metersArea + " square meters");
        }else if(unit == 2){
            System.out.println("What is the length of the room in meters?: ");
            double metersLength = in.nextDouble();
            System.out.println("What is the width of the room in meters?: ");
            double metersWidth = in.nextDouble();
            System.out.println("You entered dimensions of " + metersLength + " meters by " + metersWidth + " meters.");
            double metersArea = metersLength * metersWidth;
            System.out.println("The area is " + metersArea + " square meters .");
            double feetArea = metersArea / 0.09290304;
            System.out.println("The area is " + feetArea + " square feet.");
        }
    }




    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.calculateArea();

    }
}
