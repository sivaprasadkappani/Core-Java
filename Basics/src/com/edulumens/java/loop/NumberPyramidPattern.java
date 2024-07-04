package com.edulumens.java.loop;

public class NumberPyramidPattern {

    public static void main(String[] args) {
        int rows = 4; // Number of rows for the pyramid
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop for spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   "); // Print spaces
            }

            // Inner loop for ascending numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k + "   "); // Print numbers in descending order
            }
            
            // Inner loop for descending numbers
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " "); // Print numbers in ascending order
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
