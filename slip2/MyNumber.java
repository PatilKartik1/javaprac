// Q2. Define a class MyNumber having one private integer data member. Write a default constructor
// initialize it to O and another constructor to initialize it to a value. Write methods isNegative,
// isPositive, isOdd, iseven. Use command line argument to pass a value to the object and perform
// the above operations.
// [20 Marks]

class MyNumber {
    // Private integer data member
    private int number;

    // Default constructor initializing the number to 0
    public MyNumber() {
        this.number = 0;
    }

    // Constructor to initialize number to a specific value
    public MyNumber(int number) {
        this.number = number;
    }

    // Method to check if the number is negative
    public boolean isNegative() {
        return number < 0;
    }

    // Method to check if the number is positive
    public boolean isPositive() {
        return number > 0;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
        return number % 2 != 0;
    }

    // Method to check if the number is even
    public boolean isEven() {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Check if a command-line argument is provided
        if (args.length > 0) {
            // Convert the argument to an integer
            int value = Integer.parseInt(args[0]);
            // Create a MyNumber object using the constructor with value
            MyNumber myNumber = new MyNumber(value);

            // Perform the operations
            System.out.println("Number: " + value);
            System.out.println("Is Negative? " + myNumber.isNegative());
            System.out.println("Is Positive? " + myNumber.isPositive());
            System.out.println("Is Odd? " + myNumber.isOdd());
            System.out.println("Is Even? " + myNumber.isEven());
        } else {
            System.out.println("Please provide a number as a command-line argument.");
        }
    }
}
