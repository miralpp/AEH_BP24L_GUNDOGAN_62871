package LAB13;

import java.io.*;
import java.util.*;

public class myThirteenthApp {
    public static void main(String[] args) {
        String inputPath = "sample.txt";      // input file in the project root
        String outputPath = "output.txt";     // output file will be created here

        Map<String, Integer> wordCounts = new HashMap<>();
        int totalWords = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                        totalWords++;
                    }
                }
            }

            // Print to console
            System.out.println("Total number of words: " + totalWords);
            System.out.println("Word frequencies:");
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Write to output file
            try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
                writer.println("Input file: " + inputPath);
                writer.println("Total number of words: " + totalWords);
                writer.println("Word frequencies:");
                for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                    writer.println(entry.getKey() + ": " + entry.getValue());
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
