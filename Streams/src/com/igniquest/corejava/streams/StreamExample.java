package com.igniquest.corejava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example of creating a stream and applying operations
        List<Integer> evenNumbers = numbers.stream()
                                          .filter(n -> n % 2 == 0) // Keep only even numbers
                                          .map(n -> n * n)          // Square each number
                                          .collect(Collectors.toList()); // Collect results into a list

        System.out.println(evenNumbers); // Output: [4, 16, 36, 64, 100]
    }
}
