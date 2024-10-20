// Q2. Write a program to read the contents of “abc.txt” file. Display the contents of file in
// uppercase as output

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileToUppercase {
    public static void main(String[] args) {
        String filePath = "abc.txt"; // Path to the file
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line.toUpperCase()).append("\n"); // Convert to uppercase
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // Display the contents in uppercase
        System.out.println(content.toString());
    }
}
