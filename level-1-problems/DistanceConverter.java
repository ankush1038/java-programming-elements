import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        
        // Conversion factors
        double yards = feet / 3;
        double miles = yards / 1760;
        
        System.out.println("Your distance in feet is " + feet + " while in yards is " + yards + " and in miles is " + miles);
    }
}