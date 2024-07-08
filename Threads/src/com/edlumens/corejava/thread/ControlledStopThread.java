package com.edlumens.corejava.thread;

public class ControlledStopThread implements Runnable {
    // Volatile flag to stop the thread safely
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            try {
                System.out.println("Thread is running...");
                // Simulate some work with sleep
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handling interruption, for example in case of blocking operations
                System.out.println("Thread was interrupted.");
            }
        }
        System.out.println("Thread has stopped.");
    }

    // Method to stop the thread safely
    public void stop() {
        running = false;
    }

    public static void main(String[] args) {
        // Create the runnable instance
        ControlledStopThread controlledStopThread = new ControlledStopThread();
        // Create and start the thread
        Thread thread = new Thread(controlledStopThread);
        thread.start();

        try {
            // Let the thread run for a while
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Request the thread to stop
        System.out.println("Requesting thread to stop...");
        controlledStopThread.stop();

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}
