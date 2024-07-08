package com.edlumens.corejava.thread;

public class MyFirstThreadTest {

	public static void main(String[] args) {
		MyFirstThread mft = new MyFirstThread();
		mft.start();
	}
	
	// Multiple threads can be started
	// See how to set name
	// See Join, create 2 threads. One thread runs longer time than other.. Make both join with current thread

}
