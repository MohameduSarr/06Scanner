import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String trash = "";
        System.out.println("Enter your celsius value.");

        if (in.hasNextDouble()) {

            double c = in.nextDouble();
            double f = ((c * 9/5) + 32);
            System.out.println("Your Fahrenheit value is " + f);
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid value " + trash + ". " + "Try again.");
        }
    }
}
