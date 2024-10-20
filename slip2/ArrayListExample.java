// QI. Write a program to accept 'n' integers from the user & store them in an Array List collection.
// Display the elements of Array List.
// [10 Marks]

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Accept 'n' integers from the user
        System.out.println("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        // Loop to get 'n' integers from the user
        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // Display the elements of the ArrayList
        System.out.println("The elements in the ArrayList are: ");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
