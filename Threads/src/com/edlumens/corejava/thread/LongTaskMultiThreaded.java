package com.edlumens.corejava.thread;
 
public class LongTaskMultiThreaded {

    public static void main(String[] args) {
        // Create threads for odd and even number printing
        Thread oddThread = new Thread(new OddNumberPrinter());
        Thread evenThread = new Thread(new EvenNumberPrinter());

        // Start both threads
        oddThread.start();
        evenThread.start();
    }
 
}
