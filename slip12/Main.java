// Q1. Create a package named “Series” having a class to print series of Square of numbers. Write a
// program to generate “n” terms series.

// Step 1: Create the Package and Class
// Create a directory named Series.
// Inside the Series directory, create a Java file named SquareSeries.java.
// SquareSeries.java


package Series;

public class SquareSeries {
    // Method to print the square series
    public void printSquareSeries(int n) {
        System.out.println("Square Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " "); // Print square of each number
        }
        System.out.println(); // New line after the series
    }
}

// Step 2: Create a Main Class to Use the Package
// Create another Java file in the same directory (or outside the package if desired) to use the SquareSeries class.

import Series.SquareSeries; // Importing the SquareSeries class

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        SquareSeries squareSeries = new SquareSeries(); // Create an instance of SquareSeries
        squareSeries.printSquareSeries(n); // Call the method to print the series

        scanner.close(); // Close the scanner
    }
}

