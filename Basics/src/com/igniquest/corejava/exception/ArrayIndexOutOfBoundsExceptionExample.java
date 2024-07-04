package com.igniquest.corejava.exception;

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            // Attempt to access an element outside the bounds of the array
            System.out.println("Accessing element at index 3: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception gracefully
            System.out.println("Error: Array index is out of bounds.");
        }

        System.out.println("Program completed.");
    }
}
