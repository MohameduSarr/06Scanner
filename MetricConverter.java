import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your length in meters.");
        double meters = in.nextDouble();
        double miles = (meters/1609);
        double feet = (meters * 3.281);
        double inches = (meters * 39.37);
        String trash = "";


        if (in.hasNextDouble()) {

            meters = in.nextDouble();
            System.out.println("Your meters value in miles is " + miles);
            System.out.println("Your meters value in feet is " + feet);
            System.out.println("Your meters value in inches is " + inches);

        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid value " + trash + ". " + "Try again.");
        }

    }
}
