import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Declare variables
        double fee, discountPercent, discount, finalFee;

        // Take user input for fee
        System.out.print("Enter the student fee (INR): ");
        fee = sc.nextDouble();

        // Take user input for discount percentage
        System.out.print("Enter the university discount percentage: ");
        discountPercent = sc.nextDouble();

        // Compute discount amount
        discount = (discountPercent / 100) * fee;

        // Compute final fee after discount
        finalFee = fee - discount;

        // Display the results
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f.%n", discount, finalFee);

        // Close the scanner
        sc.close();
    }
}