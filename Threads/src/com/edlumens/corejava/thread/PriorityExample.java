package com.edlumens.corejava.thread;

public class PriorityExample {
    public static void main(String[] args) {
    	CountingThread thread1 = new CountingThread("Thread-1" , 150);
    	CountingThread thread2 = new CountingThread("Thread-2", 150);
    	CountingThread thread3 = new CountingThread("Thread-3", 150);

        thread1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        thread2.setPriority(Thread.NORM_PRIORITY); // Normal priority
        thread3.setPriority(Thread.MAX_PRIORITY); // Highest priority

        thread1.start();
        thread2.start();
        thread3.start();
    }
}