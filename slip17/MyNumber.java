// Q1. Define a class MyNumber having one private integer data member. Write a parameterized
// constructor to initialize to a value. Write isOdd() to check given number is odd or not. Use command
// line argument to pass a value to the object

class MyNumber {
    // Private data member
    private int number;

    // Parameterized constructor to initialize the number
    public MyNumber(int number) {
        this.number = number;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
        return number % 2 != 0;
    }

    // Main method to test the class using command line arguments
    public static void main(String[] args) {
        // Check if a command line argument is provided
        if (args.length > 0) {
            // Convert the first argument to an integer
            int inputNumber = Integer.parseInt(args[0]);

            // Create an object of MyNumber with the provided value
            MyNumber myNum = new MyNumber(inputNumber);

            // Check if the number is odd and display the result
            if (myNum.isOdd()) {
                System.out.println(inputNumber + " is an odd number.");
            } else {
                System.out.println(inputNumber + " is not an odd number.");
            }
        } else {
            System.out.println("Please provide a number as a command line argument.");
        }
    }
}
