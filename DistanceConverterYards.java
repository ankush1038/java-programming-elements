import java.util.Scanner;

public class DistanceConverterYards {
    public static void main(String[] args) {
        // Hint: 1 mile = 1760 yards and 1 yard = 3 feet
        
        Scanner sc = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        
        // Converting feet to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        
        // Prinitnig the output
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
        
        sc.close();
    }
}
