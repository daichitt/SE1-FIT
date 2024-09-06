package Tutorial2.ex1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
public class ex1 {
    public static void shortenFile(String inputFilePath, String outputFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words
                String[] words = line.trim().split("\\s+");

                // Join words and write to output file
                writer.write(String.join("", words));

                // Preserve line breaks
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFilePath = "src/Tutorial2/ex1/sample.text";  // Your input file
        String outputFilePath = "edited.text"; // Your desired output file
        shortenFile(inputFilePath, outputFilePath);
//        try {
//            shortenFile(inputFilePath, outputFilePath);
//        } catch (FileNotFoundException e) {
//            System.err.println("Input file not found: " + e.getMessage());
//        } catch (IOException e) {
//            System.err.println("An   error occurred while processing the file: " + e.getMessage());
//        }

    }
}
