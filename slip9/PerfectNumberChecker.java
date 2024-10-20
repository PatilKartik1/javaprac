// QI. Write a program to accept a number from user. Check whether number is perfect or not.
// Use BufferedReader class for accepting input from user.
// [ 10 Marks]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(reader.readLine());

            if (isPerfectNumber(number)) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        // Find divisors and sum them
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        // Check if sum of divisors equals the number
        return sum == num;
    }
}
