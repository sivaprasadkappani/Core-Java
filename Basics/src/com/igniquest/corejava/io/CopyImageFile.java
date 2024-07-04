package com.igniquest.corejava.io;

import java.io.*;

public class CopyImageFile {

    public static void main(String[] args) {
        String sourceFilePath = "source-image.jpg"; // Replace with your source image file path
        String destinationFilePath = "copied-image.jpg"; // Replace with your destination image file path

        try {
            // Create a FileInputStream for the source file
            FileInputStream fis = new FileInputStream(sourceFilePath);

            // Create a BufferedInputStream for efficient reading
            BufferedInputStream bis = new BufferedInputStream(fis);

            // Create a FileOutputStream for the destination file
            FileOutputStream fos = new FileOutputStream(destinationFilePath);

            // Create a BufferedOutputStream for efficient writing
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            // Create a byte array to hold data read from the source file
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from the input stream and write to the output stream
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            // Close the streams
            bis.close();
            bos.close();

            System.out.println("Image file copied successfully.");

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
