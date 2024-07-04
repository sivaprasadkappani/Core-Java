package com.igniquest.corejava.basics.array;

import java.util.Arrays;
import java.util.Scanner;

public class StringArraySorter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize array to store 10 string inputs
        String[] strings = new String[10];

        // Prompt user to enter 10 strings
        System.out.println("Enter 10 strings:");

        // Loop to get 10 string inputs
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }
        
        System.out.println( strings );

        // Sort the array of strings
        Arrays.sort(strings);

        // Display the sorted array
        System.out.println("\nSorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Close the scanner
        scanner.close();
    }
}
