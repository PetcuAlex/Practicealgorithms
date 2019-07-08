package Petcu;

import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeRemoval {

    private void removeEmployee() {
        Scanner in = new Scanner(System.in);
        ArrayList<String> employee = new ArrayList<>();
        employee.add("Bruce Lee");
        employee.add("Marshall Mathers");
        employee.add("Will Smith");
        employee.add("Aaron Paul");
        employee.add("Brad Pitt");

        for (String num : employee) {
            System.out.println(num);
        }
        String i = in.nextLine();
        employee.remove(i);
        for (String num : employee) {
            System.out.println(num);

        }
    }

    public static void main(String[] args) {

        EmployeeRemoval employeeRemoval = new EmployeeRemoval();
        employeeRemoval.removeEmployee();

    }
}
