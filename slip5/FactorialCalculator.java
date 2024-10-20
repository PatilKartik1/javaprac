// QI. Write a program to accept a number from the user, if number is zero then throw user defined
// exception —Number is O, otherwise display factorial of a number.
// [10 Marks]

import java.util.Scanner;

// Custom Exception Class
class ZeroException extends Exception {
    public ZeroException(String message) {
        super(message);
    }
}

public class FactorialCalculator {
    
    // Method to calculate factorial
    public static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int number = scanner.nextInt();

        try {
            if (number == 0) {
                throw new ZeroException("Number is 0");
            }
            long fact = factorial(number);
            System.out.println("Factorial of " + number + " is: " + fact);
        } catch (ZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
