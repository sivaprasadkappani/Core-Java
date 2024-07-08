package com.edlumens.corejava.thread;

public class MyFirstThread extends Thread {
	@Override
    public void run() {
		int i = 10;
		while( i < 50 ) {
			System.out.println(getName() + " is running..." + i );
			i++;
		}
		System.out.println(getName() + "finished." );
    }
}
