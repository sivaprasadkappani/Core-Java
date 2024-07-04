package com.igniquest.corejava.exception;

public class NullPointerExceptionExample {

    public static void main(String[] args) {
        String str = null; // Initialize a String variable to null

        try {
            // Attempt to get the length of the string
            int length = str.length(); // This line will throw NullPointerException
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            // Handle the exception gracefully
            System.out.println("Error: String is null. Cannot get length.");
        }
    
        System.out.println("Program completed.");
    }
}

