// Q1. Write a program to accept the 'n' different numbers from user and store it in array. Display
// maximum number from an array.

import java.util.Scanner;

public class MaxNumberArray {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        // Create an array to store 'n' numbers
        int[] numbers = new int[n];
        
        // Accept 'n' numbers from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // Find the maximum number
        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // Display the maximum number
        System.out.println("The maximum number is: " + max);
        
        // Close the scanner
        sc.close();
    }
}
