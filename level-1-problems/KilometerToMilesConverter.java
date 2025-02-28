import java.util.Scanner;

public class KilometerToMilesConverter {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare the variable for kilometers
        double km;

        // Prompt user for input
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Conversion factor: 1 mile = 1.6 km
        double miles = km / 1.6;

        // Display the result
        System.out.printf("The total miles is %.2f miles for the given %.2f km.%n", miles, km);

        // Close the scanner
        input.close();
    }
}
