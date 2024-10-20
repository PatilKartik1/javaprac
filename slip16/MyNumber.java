// Q1. Define a class MyNumber having one private integer data member. Write a parameterized
// constructor to initialize to a value. Write isEven() to check given number is even or not. Use
// command line argument to pass a value to the object.

public class MyNumber {
    // Private integer data member
    private int number;

    // Parameterized constructor to initialize the number
    public MyNumber(int number) {
        this.number = number;
    }

    // Method to check if the number is even
    public boolean isEven() {
        return this.number % 2 == 0;
    }

    // Main method to create the object using command line arguments
    public static void main(String[] args) {
        // Check if a command line argument is provided
        if (args.length > 0) {
            // Convert the command line argument from String to integer
            int value = Integer.parseInt(args[0]);

            // Create an object of MyNumber using the parameterized constructor
            MyNumber myNumber = new MyNumber(value);

            // Display whether the number is even or odd
            if (myNumber.isEven()) {
                System.out.println(value + " is even.");
            } else {
                System.out.println(value + " is odd.");
            }
        } else {
            System.out.println("Please provide a number as a command line argument.");
        }
    }
}
