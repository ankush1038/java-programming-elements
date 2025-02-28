public class EarthVolume {
    public static void main(String[] args) {
        // Given radius of Earth in kilometers
        double radiusKm = 6378;
        
        // Conversion factor from km to miles
        double kmToMiles = 0.621371;
        
        // Compute volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Compute volume in cubic miles
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        // Print the result
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
