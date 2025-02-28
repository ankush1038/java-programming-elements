public class CourseFeeDiscount {
    public static void main(String[] args) {
        // Given course fee and discount percentage
        double fee = 125000;
        double discountPercent = 10;
        
        // Calculate discount amount
        double discount = (fee * discountPercent) / 100;
        
        // Calculate final fee after discount
        double finalFee = fee - discount;
        
        // Print the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
