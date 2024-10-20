// Q 1. Accept 'n' integers from the user and store them in a collection. Display them in the sorted order.
// The collection should not accept duplicate elements. (Use a suitable collection). Search fora
// particular element using predefined search method in the Collection framework. [IO Marks]

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueSortedIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> integerSet = new TreeSet<>();

        System.out.print("Enter the number of integers you want to input: ");
        int n = scanner.nextInt();

        // Accept n integers from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            integerSet.add(scanner.nextInt());
        }

        // Display the sorted integers
        System.out.println("Sorted unique integers: " + integerSet);

        // Search for a particular element
        System.out.print("Enter an integer to search: ");
        int searchElement = scanner.nextInt();
        if (integerSet.contains(searchElement)) {
            System.out.println(searchElement + " is present in the collection.");
        } else {
            System.out.println(searchElement + " is not present in the collection.");
        }

        scanner.close();
    }
}
