package com.edlumens.corejava.thread.racecondition;

class CounterUser implements Runnable {
    private SimpleCounter counter;

    public CounterUser(SimpleCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incrementValue();
        }
    }
}