package linearandbinarysearch.filereader.counttheoccurrence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurrence {

    public static void main(String[] args) {
        // Specify the file path and word to search
        String filepath = "src/main/java/linearandbinarysearch/filereader/counttheoccurrence/Sample.txt";
        String wordToCount = "Thread"; // Change this to the word you want to count
        int count = 0; // To store the word occurrence count

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Split the line into words using space as the delimiter
                String[] words = line.split("\\s+");
                // Count occurrences of the word in the current line
                for (String word : words) {
                    if (word.equalsIgnoreCase(wordToCount)) {
                        count++;
                    }
                }
            }
            // Print the total occurrences of the word
            System.out.println("The word '" + wordToCount + "' occurred " + count + " times.");
        } catch (FileNotFoundException e) {
            // Handle file not found
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // Handle other IO exceptions
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
