// QI. Write a program to accept 3 numbers using command line argument. Sort and display the
// numbers.
// [10 Marks]

public class SortNumbers {
    public static void main(String[] args) {
        // Check if exactly 3 arguments are passed
        if (args.length != 3) {
            System.out.println("Please provide exactly 3 numbers.");
            return;
        }

        // Parse the command line arguments to integers
        int[] numbers = new int[3];
        try {
            for (int i = 0; i < 3; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
            return;
        }

        // Sort the numbers
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Display sorted numbers
        System.out.println("Sorted Numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
