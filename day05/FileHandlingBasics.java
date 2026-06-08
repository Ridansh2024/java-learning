// Day 5: File Handling in Java (I/O)

import java.io.*;
import java.util.*;

public class FileHandlingBasics {

    // TODO 1: Write text to a file
    public static void writeToFile(String filename, String content) {
        // Use FileWriter + BufferedWriter
        // Hint:
        // BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        // writer.write(content);
        // writer.close();
    }

    // TODO 2: Read text from a file
    public static String readFromFile(String filename) {
        // Use FileReader + BufferedReader
        // Hint:
        // BufferedReader reader = new BufferedReader(new FileReader(filename));
        // String line; while ((line = reader.readLine()) != null) { ... }
        // reader.close();
        return "";
    }

    // TODO 3: Append text to existing file
    public static void appendToFile(String filename, String content) {
        // Hint: new FileWriter(filename, true) ← true means append mode
    }

    // TODO 4: Check if file exists, get file size
    public static void fileInfo(String filename) {
        // Use File class
        // File file = new File(filename);
        // file.exists(), file.length(), file.getName(), file.getAbsolutePath()
    }

    // TODO 5: Read file using try-with-resources (modern way)
    public static String readModern(String filename) {
        // try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
        //     // auto-closes! no need for finally
        // }
        return "";
    }

    // TODO 6: Copy file content from one file to another
    public static void copyFile(String source, String destination) {
        // Read from source, write to destination
    }

    public static void main(String[] args) {
        System.out.println("=== File Handling Demo ===");

        // TODO: Test all methods
        // writeToFile("test.txt", "Hello, Java File I/O!");
        // System.out.println(readFromFile("test.txt"));
        // appendToFile("test.txt", "\nThis is appended line.");
        // System.out.println(readFromFile("test.txt"));
        // fileInfo("test.txt");
        // copyFile("test.txt", "copy.txt");
    }
}
