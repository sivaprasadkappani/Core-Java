package com.edlumens.corejava.thread.racecondition;

public class RaceConditionExample {
	    public static void main(String[] args) {
	        SimpleCounter counter = new SimpleCounter();

	        // Create multiple threads that use the same SimpleCounter instance
	        Thread thread1 = new Thread(new CounterUser(counter), "Thread-1");
	        Thread thread2 = new Thread(new CounterUser(counter), "Thread-2");
	        Thread thread3 = new Thread(new CounterUser(counter), "Thread-3");

	        // Start the threads
	        thread1.start();
	        thread2.start();
	        thread3.start();

	        // Wait for the threads to finish
	        try {
	            thread1.join();
	            thread2.join();
	            thread3.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Print the final value of the counter
	        System.out.println("Final counter value: " + counter.readValue());
	    }
	}
