package com.igniquest.corejava.basics.access.package1;

//MyBaseClass.java

//Base class with various access modifiers
public class MyBaseClass {
	public int publicVar = 10;
	private int privateVar = 20;
	protected int protectedVar = 30;
	int defaultVar = 40; // default

	// Method to display variables
	public void printVaraibales() {
		// Within class ALL scope variables are available
		System.out.println("Public variable: " + publicVar);
		System.out.println("Protected variable: " + protectedVar);
		System.out.println("Default variable: " + defaultVar);
		System.out.println("Private variable: " + privateVar);
	}
}
