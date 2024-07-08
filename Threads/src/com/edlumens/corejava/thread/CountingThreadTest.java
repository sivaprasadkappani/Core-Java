package com.edlumens.corejava.thread;

public class CountingThreadTest {

	public static void main(String[] args) {
        // Create and start three CountingThread instances
        CountingThread thread1 = new CountingThread("Counter-1", 5);
        CountingThread thread2 = new CountingThread("Counter-2", 3);
        CountingThread thread3 = new CountingThread("Counter-3", 4);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Main thread waits for all counting threads to finish
        /*
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

        System.out.println("All threads have finished.");
    }
}
