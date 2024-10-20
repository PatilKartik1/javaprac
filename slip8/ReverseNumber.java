// Q 1. Write a program to reverse a number. Accept number using command line argument.
// [10 Marks]

public class ReverseNumber {
    public static void main(String[] args) {
        // Check if a number is provided as a command-line argument
        if (args.length != 1) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        // Convert the input string to an integer
        int number = Integer.parseInt(args[0]);
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversedNumber);
    }
}

