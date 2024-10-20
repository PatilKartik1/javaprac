// Q2. Write a program to accept Doctor Name from the user and check whether it is valid or not. (It
// should not contain digits and special symbol) If it is not valid then throw user defined Exception -
// Name is Invalid -- otherwise display the name.
// [20 Marks]

import java.util.Scanner;

// User-defined exception class
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class DoctorNameValidator {

    // Method to check if the doctor name is valid
    public static void validateDoctorName(String name) throws InvalidNameException {
        // Regular expression to check for any digits or special characters
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new InvalidNameException("Name is Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting doctor name from the user
        System.out.println("Enter Doctor Name: ");
        String doctorName = scanner.nextLine();

        try {
            // Validate the name
            validateDoctorName(doctorName);
            // If valid, display the name
            System.out.println("Doctor Name: " + doctorName);
        } catch (InvalidNameException e) {
            // Display the exception message if invalid
            System.out.println(e.getMessage());
        }
    }
}
