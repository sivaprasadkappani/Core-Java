package com.edlumens.corejava.thread;

public class ThreadInterruptionExample {
	 public static void main(String[] args) {
	        // Create and start the LongRunningTask thread
		    CountingThread task = new CountingThread( "Thread-1", 1000 );
	        task.start();

	        // Allow the thread to run for a short time
	        try {
	            Thread.sleep(3500); // Main thread sleeps for 3.5 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Interrupt the LongRunningTask thread
	        System.out.println("Interrupting " + task.getName() + "...");
	        task.interrupt();

	        // Wait for the LongRunningTask thread to finish
	        try {
	            task.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Main thread is done.");
	    }
	}