import java.util.Scanner;
public class billingsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of items the customer is purchasing
        System.out.print("Enter the number of items: ");
        int numItems = scanner.nextInt();
        
        // Arrays to hold item details
        String[] itemNames = new String[numItems];
        int[] itemQuantities = new int[numItems];
        double[] itemPrices = new double[numItems];
        
        // Input details for each item
        for (int i = 0; i < numItems; i++) {
            System.out.println("Item " + (i + 1) + ": ");
            System.out.print("Enter item name: ");
            itemNames[i] = scanner.next();
            
            System.out.print("Enter item quantity: ");
            itemQuantities[i] = scanner.nextInt();
            
            System.out.print("Enter item price: ");
            itemPrices[i] = scanner.nextDouble();
        }
        
        // Input tax percentage
        System.out.print("Enter tax percentage (e.g., 10 for 10%): ");
        double taxPercentage = scanner.nextDouble();
        
        // Input discount percentage
        System.out.print("Enter discount percentage (e.g., 5 for 5%): ");
        double discountPercentage = scanner.nextDouble();
        
        // Calculate the total amount before tax and discount
        double totalAmount = 0;
        for (int i = 0; i < numItems; i++) {
            totalAmount += itemPrices[i] * itemQuantities[i];
        }
        
        // Calculate tax and discount
        double taxAmount = (taxPercentage / 100) * totalAmount;
        double discountAmount = (discountPercentage / 100) * totalAmount;
        
        // Calculate final amount
        double finalAmount = totalAmount + taxAmount - discountAmount;
        
        // Display the bill
        System.out.println("\n----- Bill Summary -----");
        for (int i = 0; i < numItems; i++) {
            System.out.println(itemNames[i] + " - Quantity: " + itemQuantities[i] + " - Price: $" + itemPrices[i]);
        }
        System.out.println("-------------------------");
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Tax (" + taxPercentage + "%): $" + taxAmount);
        System.out.println("Discount (" + discountPercentage + "%): -$" + discountAmount);
        System.out.println("-------------------------");
        System.out.println("Final Amount to Pay: $" + finalAmount);
    }
}


