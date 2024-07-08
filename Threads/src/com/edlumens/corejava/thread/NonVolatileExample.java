package com.edlumens.corejava.thread;

public class NonVolatileExample {
    // Shared flag variable, not declared as volatile
    private static  boolean flag = false;

    public static void main(String[] args) {
        // Creating a thread to monitor the flag variable
        Thread monitorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Monitor thread started and waiting for flag to be true...");
                while (!flag) {
                    // Busy-wait until the flag becomes true
                    // This loop might never terminate if flag is not seen as true
                }
                System.out.println("Flag is now true. Monitor thread finished.");
            }
        });

        // Creating a thread to set the flag variable
        Thread updaterThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // Simulating some work with sleep
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Updating the flag variable
                System.out.println("Updater thread is setting the flag to true...");
                flag = true;
            }
        });

        // Start both threads
        monitorThread.start();
        updaterThread.start();

        try {
            // Wait for both threads to finish
            monitorThread.join();
            updaterThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}
	