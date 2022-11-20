import java.util.Scanner;
import java.lang.Math;
public class RectangleInfo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of your rectangle.");
        double length = in.nextDouble();
        double width = in.nextDouble();
        double area = (length * width);
        double perimeter = (length + length + width + width);
        double diagonal = (Math.sqrt(width * width + length * length));
        String trash = "";


        Scanner in2 = null;
        if (in.hasNextDouble()) {
            in2 = new Scanner(System.in);
            System.out.println("Enter the width of your rectangle.");
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid value " + trash + ". " + "Try again.");
        }
        if (in2.hasNextDouble()) {
            System.out.println("Your area is " + area + ", your perimeter is " + perimeter + ", and your diagonal is " + diagonal + ".");
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid value " + trash + ". " + "Try again.");
        }
    }
    }
