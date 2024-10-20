// QI. Write a program to accept the user name and greets the user by name. Before displaying the
// user's name, convert it to upper case letters. For example, if the user's name is Raj, then display
// greet message as "Hello, RAJ, nice to meet you! "
// [10 Marks]

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Convert the name to uppercase
        String upperCaseName = name.toUpperCase();
        
        // Display the greeting message
        System.out.println("Hello, " + upperCaseName + ", nice to meet you!");
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
