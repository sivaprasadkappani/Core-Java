package com.edlumens.corejava.thread;

public class LongTask {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("First 600 Odd Numbers:");
        for (int i = 1, oddCount = 0; oddCount < 150; i += 2) {
            System.out.print(i + " ");
            oddCount++;

            // Print 50 numbers per line
            if (oddCount % 20 == 0) {
                System.out.println();
            }

            // Add a delay of 500 milliseconds
            Thread.sleep(50);
        }
        System.out.println("Completed Odd number printing");

        System.out.println("First 600 Even Numbers:");
        for (int i = 2, evenCount = 0; evenCount < 150; i += 2) {
            System.out.print(i + " ");
            evenCount++;

            // Print 50 numbers per line
            if (evenCount % 25 == 0) {
                System.out.println();
            }

            // Add a delay of 500 milliseconds
            Thread.sleep(50);
        }
        System.out.println("Completed Even number printing");
    }
}