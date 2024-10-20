// QI. Write a program to accept the 'n' different numbers from user and store it in array. Also print
// the sum of elements of the array.
// [10 Marks]

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting the size of the array
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Declaring an array to store the numbers
        int[] numbers = new int[n];

        // Accepting 'n' numbers from the user
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculating the sum of the array elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        // Printing the sum of the elements
        System.out.println("The sum of the elements is: " + sum);
    }
}
