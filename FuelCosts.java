import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter the number of fuel gallons in the car's tank: ");

        int numGallons = in.nextInt();

        System.out.print("What is the fuel efficiency of your car in miles/gallon ");

        double fuelEffi = in.nextDouble();

        System.out.print("How much is the price per gallon: ");

        double price = in.nextDouble();

        double milesCanGo = fuelEffi*numGallons;

        double numOfGallons = 100/fuelEffi;

System.out.println("The cost per 100 miles is " +numOfGallons * price);

System.out.println("Your car can go as far as "+ milesCanGo +" miles with the current fuel " + "in your tank");

    }
}
