// Q2. Create an abstract class “order” having members id, description. Create a subclass
// “Purchase Order” having member as customer name. Define methods accept and display.
// Create 3 objects each of Purchase Order. Accept and display the details.

import java.util.Scanner;

// Abstract class 'Order'
abstract class Order {
    int id;
    String description;

    // Abstract methods
    abstract void accept();
    abstract void display();
}

// Subclass 'PurchaseOrder'
class PurchaseOrder extends Order {
    String customerName;

    // Method to accept details
    @Override
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Order Description: ");
        description = sc.nextLine();
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();
    }

    // Method to display details
    @Override
    void display() {
        System.out.println("Order ID: " + id);
        System.out.println("Order Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create 3 objects of PurchaseOrder
        PurchaseOrder po1 = new PurchaseOrder();
        PurchaseOrder po2 = new PurchaseOrder();
        PurchaseOrder po3 = new PurchaseOrder();

        // Accept details for each order
        System.out.println("Enter details for Order 1:");
        po1.accept();
        System.out.println("\nEnter details for Order 2:");
        po2.accept();
        System.out.println("\nEnter details for Order 3:");
        po3.accept();

        // Display details for each order
        System.out.println("\nDetails of Order 1:");
        po1.display();
        System.out.println("\nDetails of Order 2:");
        po2.display();
        System.out.println("\nDetails of Order 3:");
        po3.display();
    }
}
