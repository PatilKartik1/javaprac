// Q2. Write a program which define class Product with data member as id, name and price. Store
// the information of 5 products and Display the name of product having minimum price (Use array
// of object).
// [20 Marks]

import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    // Constructor to initialize Product object
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array to store 5 Product objects
        Product[] products = new Product[5];
        
        // Scanner to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Input details of 5 products
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            
            // Initialize Product object
            products[i] = new Product(id, name, price);
        }
        
        // Find the product with the minimum price
        Product minPriceProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].price < minPriceProduct.price) {
                minPriceProduct = products[i];
            }
        }
        
        // Display the product with the minimum price
        System.out.println("The product with the minimum price is: " + minPriceProduct.name);
        
        // Close scanner
        scanner.close();
    }
}
