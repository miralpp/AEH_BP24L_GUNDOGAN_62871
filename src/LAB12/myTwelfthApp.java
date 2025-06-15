package LAB12;

import java.io.*;
import java.util.Scanner;

public class myTwelfthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter input file path:");
            String inputPath = scanner.nextLine();
            System.out.println("Enter output file path:");
            String outputPath = scanner.nextLine();

            File inputFile = new File(inputPath);
            if (!inputFile.exists()) {
                System.out.println("File does not exist. Try again.");
                continue;
            }

            int lineCount = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                while (reader.readLine() != null) {
                    lineCount++;
                }
            } catch (IOException e) {
                System.out.println("Error reading input file.");
                continue;
            }

            System.out.println("Number of lines: " + lineCount);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                writer.write("File: " + inputFile.getName() + ", Lines: " + lineCount);
            } catch (IOException e) {
                System.out.println("Error writing output file.");
            }

            break;
        }

    }
}
