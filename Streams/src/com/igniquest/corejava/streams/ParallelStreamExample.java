package com.igniquest.corejava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }

        // Example of sequential stream: Squaring each number
        long startTime = System.currentTimeMillis();

        List<Integer> squaredNumbersSequential = numbers.stream()
                                                        .map(num -> square(num))
                                                        .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();
        long durationSequential = endTime - startTime;
        System.out.println("Sequential Stream Duration: " + durationSequential + " ms");

        // Example of parallel stream: Squaring each number
        startTime = System.currentTimeMillis();

        List<Integer> squaredNumbersParallel = numbers.parallelStream()
                                                      .map(num -> square(num))
                                                      .collect(Collectors.toList());

        endTime = System.currentTimeMillis();
        long durationParallel = endTime - startTime;
        System.out.println("Parallel Stream Duration: " + durationParallel + " ms");

        // Compare the durations
        System.out.println("Speedup factor: " + (double) durationSequential / durationParallel);
    }

    // Method to square a number (simulate a time-consuming operation)
    public static int square(int num) {
        try {
            Thread.sleep(10); // Simulate a time-consuming operation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return num * num;
    }
}
