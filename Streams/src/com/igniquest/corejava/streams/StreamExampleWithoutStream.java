package com.igniquest.corejava.streams;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamExampleWithoutStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 11, 3, 23, 5, 6, 7, 13, 9, 10);

        // Create a HashMap to store the original number and its squared value
        Map<Integer, Integer> evenNumberSquares = new HashMap<>();

        // Iterate over each number in the list
        for (Integer number : numbers) {
            // Check if the number is even
            if (number % 2 == 0) {
                // Square the even number and put it in the HashMap
                evenNumberSquares.put(number, number * number);
            }
        }

        // Loop through the HashMap and print the key-value pairs
        for (Map.Entry<Integer, Integer> entry : evenNumberSquares.entrySet()) {
            System.out.println("Original number: " + entry.getKey() + ", Squared value: " + entry.getValue());
        }

        // For visual confirmation, you can also print the entire HashMap
        System.out.println("HashMap content: " + evenNumberSquares);
    }
}
