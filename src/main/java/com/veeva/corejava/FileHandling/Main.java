
package com.veeva.corejava.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            // 1. Create a file
            File file = new File("student.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }

            // 2. Write data into file
            try (FileWriter writer = new FileWriter(file)) {

                writer.write("Name: Mounika\n");
                writer.write("Course: Java\n");
                writer.write("Topic: File Handling\n");

            }

            System.out.println("Data written successfully");

            // 3. Read data from file
            System.out.println("\nFile Content:");

            try (FileReader reader = new FileReader(file)) {

                int character;

                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                }

            }

            // 4. Display file information
            System.out.println("\n\nFile Name: " + file.getName());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("File Exists: " + file.exists());

            // 5. Delete file (optional)
            // file.delete();

        } catch (IOException e) {

            System.out.println("An error occurred: " + e.getMessage());

        }
    }
}
