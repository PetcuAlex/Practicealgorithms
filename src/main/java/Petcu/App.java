package Petcu;

/**
 * Hello world!
 *
 */
public class App
{
    public void displayAverage(double a, double b, double c){
        System.out.println("Calculating average of: " +a + ", " + b + ", " + c);
        double average = (a + b + c) / 3;
        System.out.println("Average: " + average);
    }




    public static void main( String[] args )
    {
        App app = new App();
        app.displayAverage(19,20.5,89);
    }
}
