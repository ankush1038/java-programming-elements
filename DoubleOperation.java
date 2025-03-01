import java.util.Scanner;

class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter fee amount: ");
        double fee = sc.nextDouble();
        
        System.out.print("Enter discount percent: ");
        double discountPercent = sc.nextDouble();
        
        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();
        
        double result1 = fee + (discountPercent * c);
        double result2 = (fee * discountPercent) + c;
        double result3 = c + (fee / discountPercent);
        
        System.out.println("The results of Double Operations are: " + result1 + ", " + result2 + ", and " + result3);
        
        sc.close();
    }
}