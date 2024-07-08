package com.edlumens.corejava.thread;

public class SimpleCountingThreadTest {
	public static void main(String[] args) {
        // Create and start three CountingThread instances
		SimpleCountingThread thread1 = new SimpleCountingThread();
		SimpleCountingThread thread2 = new SimpleCountingThread();
		SimpleCountingThread thread3 = new SimpleCountingThread();

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Main thread waits for all counting threads to finish
       
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        

        System.out.println("All threads have finished.");
    }
}
