package com.edlumens.corejava.thread;

public class NonVolatileInstanceExample {
    // Shared flag variable as an instance variable, not declared as volatile
    private volatile boolean flag = false;

    public static void main(String[] args) {
        // Create an instance of the class to share the flag variable
        NonVolatileInstanceExample example = new NonVolatileInstanceExample();

        // Creating a thread to monitor the flag variable
        Thread monitorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Monitor thread started and waiting for flag to be true...");
                while (!example.isFlag()) {
                    // Busy-wait until the flag becomes true
                    // This loop might never terminate if flag is not seen as true
                }
                System.out.println("Flag is now true. Monitor thread finished.");
            }
        });

        // Creating a thread to set the flag variable
        Thread updaterThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // Simulating some work with sleep
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Updating the flag variable
                System.out.println("Updater thread is setting the flag to true...");
                example.setFlag(true);
            }
        });

        // Start both threads
        monitorThread.start();
        updaterThread.start();

        try {
            // Wait for both threads to finish
            monitorThread.join();
            updaterThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }

    // Getter for the flag variable
    public boolean isFlag() {
        return flag;
    }

    // Setter for the flag variable
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
