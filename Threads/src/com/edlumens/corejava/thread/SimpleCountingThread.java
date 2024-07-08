package com.edlumens.corejava.thread;

class SimpleCountingThread extends Thread {
 
    // Override the run method to define the task for this thread
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(100); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
                return; // Exit if interrupted
            }
        }
        System.out.println(getName() + " has finished counting.");
    }
}