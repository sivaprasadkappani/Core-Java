package com.edlumens.corejava.thread;

 class EvenNumberPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("First 600 Even Numbers:");
        for (int i = 2, evenCount = 0; evenCount < 200; i += 2) {
            System.out.print(i + " ");
            evenCount++;

            // Print 25 numbers per line
            if (evenCount % 25 == 0) {
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