package Petcu;



import java.util.Scanner;

public class TimeConvertor {

    private void convertTime() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        long minutes = in.nextLong();
        long minutesInYear = 60 * 24 * 365;
        long year = minutes / minutesInYear;
        long day = (minutes/60/24 ) %365;
        System.out.println(minutes + " minutes are approximately " +year +" years and " + day + " days." );


    }

    public static void main(String[] args) {
        TimeConvertor timeConvertor = new TimeConvertor();
        timeConvertor.convertTime();
    }
}
