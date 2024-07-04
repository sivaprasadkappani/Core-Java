package com.igniquest.corejava.io;

import java.io.File;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Create a File object representing a file
        File file = new File(filePath);

        try {
            // Check if the file exists
            if (file.exists()) {
                System.out.println("File " + filePath + " exists.");
            } else {
                System.out.println("File " + filePath + " does not exist. Creating it...");
                // Create a new file
                boolean fileCreated = file.createNewFile();
                if (fileCreated) {
                    System.out.println("File " + filePath + " created successfully.");
                } else {
                    System.out.println("Failed to create file " + filePath + ".");
                }
            }

            // Print file information
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Parent directory: " + file.getParent());

            // Check if it's a file or directory
            if (file.isFile()) {
                System.out.println(filePath + " is a file.");
            } else if (file.isDirectory()) {
                System.out.println(filePath + " is a directory.");
            }

            // Delete the file
            boolean fileDeleted = file.delete();
            if (fileDeleted) {
                System.out.println("File " + filePath + " deleted successfully.");
            } else {
                System.out.println("Failed to delete file " + filePath + ".");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
