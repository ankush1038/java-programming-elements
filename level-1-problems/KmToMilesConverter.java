import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        
        // Conversion factor
        double conversionFactor = 1.6;
        
        // Convert kilometers to miles
        double miles = km / conversionFactor;
        
        // Print the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        
        input.close();
    }
}