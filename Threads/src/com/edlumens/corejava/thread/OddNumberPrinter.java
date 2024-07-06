package com.edlumens.corejava.thread;

 class OddNumberPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("First 600 Odd Numbers:");
        for (int i = 1, oddCount = 0; oddCount < 200; i += 2) {
            System.out.print(i + " ");
            oddCount++;

            // Print 20 numbers per line
            if (oddCount % 20 == 0) {
                System.out.println();
            }

            // Add a delay of 50 milliseconds
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n");
    }
}
