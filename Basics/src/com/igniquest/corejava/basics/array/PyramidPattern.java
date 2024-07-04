package com.igniquest.corejava.basics.array;

public class PyramidPattern {

    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); // Print spaces
            }

            // Inner loop for stars
            
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*"); // Print stars
            }
             

            System.out.println(); // Move to the next line after each row
        }
    }
}
