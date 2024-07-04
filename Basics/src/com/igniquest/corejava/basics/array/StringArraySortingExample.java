package com.igniquest.corejava.basics.array;

import java.util.Arrays;

public class StringArraySortingExample {

    public static void main(String[] args) {
        // Initialize an array of strings
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Mango"};

        // Display original order
        System.out.println("Original order:");
        displayArray(fruits);

        // Sort the array
        Arrays.sort(fruits);

        // Display sorted order
        System.out.println("\nSorted order:");
        displayArray(fruits);
    }

    // Method to display elements of an array
    private static void displayArray(String[] arr) {
        for (String element : arr) {
            System.out.println(element);
        }
    }
}
