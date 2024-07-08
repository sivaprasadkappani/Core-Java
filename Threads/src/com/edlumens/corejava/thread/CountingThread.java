package com.edlumens.corejava.thread;

class CountingThread extends Thread {
    private int countLimit;

    // Constructor to set up the count limit and thread name
    public CountingThread(String name, int countLimit) {
        super(name); // Set the thread name
        this.countLimit = countLimit;
    }

    // Override the run method to define the task for this thread
    @Override
    public void run() {
        for (int i = 1; i <= countLimit; i++) {
           // System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(10); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
                return; // Exit if interrupted
            }
        }
        System.out.println(getName() + " has finished counting.");
    }
}