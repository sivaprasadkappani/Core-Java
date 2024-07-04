package com.igniquest.corejava.exception;

import java.util.Scanner;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            // Read input from user
            int number = scanner.nextInt();

            // Perform division
            int result = 10 / number;
            System.out.println("Result of 10 divided by " + number + " is: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
        	e.printStackTrace();
            System.out.println("Error: Division by zero is not allowed.");
        } catch (java.util.InputMismatchException e) {
            // Handle any other exceptions
        	e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner to release resources
        	System.out.println( "See, finally is executed irrespective of exception" );
            scanner.close();
        }

        System.out.println("Program completed.");
    }
}
