public class KilometersToMilesConverter {
    public static void main(String[] args) {
        // Given distance in kilometers
        double kilometers = 10.8;
        
        // Conversion
        double conversion = 1.6;
        
        // Convert to miles
        double miles = kilometers / conversion;
        
        // Print the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
