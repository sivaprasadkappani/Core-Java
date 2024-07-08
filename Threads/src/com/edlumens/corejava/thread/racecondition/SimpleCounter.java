package com.edlumens.corejava.thread.racecondition;

class SimpleCounter {
    private volatile int counter = 0;

    // Method to read the current value of the counter
    public int readValue() {
        return counter;
    }

    // Method to increment the counter
    public  void incrementValue() {
   // public synchronized void incrementValue() {
        int current = counter; // Read the current value
        current++;             // Increment the value
        counter = current;     // Write the incremented value back
    }
}
