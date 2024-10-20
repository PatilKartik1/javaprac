// Q2. Write a program to copy the contents from one file into another file in upper case.
// [20 Marks]

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyToUpperCase {
    public static void main(String[] args) {
        // File paths
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (FileReader reader = new FileReader(sourceFile); FileWriter writer = new FileWriter(destinationFile)) {
            int character;
            
            // Read character by character
            while ((character = reader.read()) != -1) {
                // Convert to uppercase and write to the destination file
                writer.write(Character.toUpperCase(character));
            }

            System.out.println("File copied successfully with all characters in uppercase.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
