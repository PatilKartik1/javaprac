// Q1. Write a program to print the factors of a number. Accept a number using command line
// argument.

public class Factors {
    public static void main(String[] args) {
        // Check if the user has provided an argument
        if (args.length != 1) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        // Parse the command line argument to an integer
        int num = Integer.parseInt(args[0]);

        System.out.println("Factors of " + num + " are:");
        // Loop through 1 to num to find factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
