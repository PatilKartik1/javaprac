// Q2. Write a program that displays the number of characters, lines and words of a file.
// [20 Marks]

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStatistics {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Change this to your file path
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++; // Increment line count
                characterCount += line.length(); // Count characters in the line
                wordCount += line.split("\\s+").length; // Count words
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display the counts
        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}
