package Petcu;

import java.util.Scanner;

public class TroubleshootingCar {

    private void checkIssue() {

        Scanner in = new Scanner(System.in);
        String silent;
        String battery;
        String clickingNoise;
        String crankToFail;
        String engineDie;
        String fuelInjection;

        System.out.println("Is the car silent when you turn the key?");
        silent = in.next();
        if (silent.equalsIgnoreCase("yes") | silent.equalsIgnoreCase("y")) {
            System.out.println("Are the battery terminals corroded?");
            battery = in.next();
            if (battery.equalsIgnoreCase("yes") | battery.equalsIgnoreCase("y")) {
                System.out.println("Clean terminals and try starting again.");
            } else if (battery.equalsIgnoreCase("no") | battery.equalsIgnoreCase("n")) {
                System.out.println("Replace cables and try again.");
            }
        } else if (silent.equalsIgnoreCase("no") | silent.equalsIgnoreCase("n")) {
            System.out.println("Does the car make a clicking noise?");
            clickingNoise = in.next();
            if (clickingNoise.equalsIgnoreCase("yes") | clickingNoise.equalsIgnoreCase("y")) {
                System.out.println("Replace the battery.");
            } else if (clickingNoise.equalsIgnoreCase("no") | clickingNoise.equalsIgnoreCase("n")) {
                System.out.println("Does the car crank up but fail to start?");
                crankToFail = in.next();
                if (crankToFail.equalsIgnoreCase("yes") | crankToFail.equalsIgnoreCase("y")) {
                    System.out.println("Check spark plug connections");
                } else if (crankToFail.equalsIgnoreCase("no") | crankToFail.equalsIgnoreCase("n")) {
                    System.out.println("Does the engine start and then die?");
                    engineDie = in.next();
                    if (engineDie.equalsIgnoreCase("yes") | engineDie.equalsIgnoreCase("y")) {
                        System.out.println("Does your car have fuel injection?");
                        fuelInjection = in.next();
                        if (fuelInjection.equalsIgnoreCase("yes") | fuelInjection.equalsIgnoreCase("y")) {
                            System.out.println("Get it in for service.");
                        } else if (fuelInjection.equalsIgnoreCase("no") | fuelInjection.equalsIgnoreCase("n")) {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    } else if (engineDie.equalsIgnoreCase("no") | engineDie.equalsIgnoreCase("n")) {
                        System.out.println("Your car is OK.");
                    }
                }
            }
        }

    }


    public static void main(String[] args) {

        TroubleshootingCar troubleshootingCar = new TroubleshootingCar();
        troubleshootingCar.checkIssue();

    }
}
