package com.igniquest.corejava.io;

import java.io.*;

public class TextFileHandler {

    private String fileName;

    public TextFileHandler(String fileName) {
        this.fileName = fileName;
    }

    // Method to create the file if it doesn't exist
    public void createFile() {
        File file = new File(fileName);
        if (file.exists()) {
        	System.out.println( "File already exists." );
        }
        else {
        	try {
				file.createNewFile();
			} catch (IOException e) {
				 e.printStackTrace();
			}
        }
         
    }

    // Method to append a line to the file
    public void appendLine(String line) {
        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {
            pw.println(line);
            System.out.println("Line appended to " + fileName + ": " + line);
        } catch (IOException e) {
            System.err.println("Error appending line to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example usage:
    	
        String fileName = "D:\\Temp\\Java Training\\Files\\example.txt"; // Replace with your file name

        TextFileHandler handler = new TextFileHandler(fileName);
        handler.createFile();
        handler.appendLine("First line appended.");
        handler.appendLine("Second line appended.");
    }
}
