package com.igniquest.corejava.generics;

//Main class to demonstrate the use of generic Box
public class BoxUser {
	public static void main(String[] args) {
		// Create a Box to hold an Integer
		Box<Integer> integerBox = new Box<>(123);
		System.out.println(integerBox);
		System.out.println("Content: " + integerBox.getContent());
		

		// Create a Box to hold a String
		Box<String> stringBox = new Box<>("Hello Generics!");
		System.out.println(stringBox);
		System.out.println("Content: " + stringBox.getContent());

		// Create a Box to hold a Double
		Box<Double> doubleBox = new Box<>(45.67);
		System.out.println(doubleBox);
		System.out.println("Content: " + doubleBox.getContent());

		// Change the content of the integerBox
		integerBox.setContent(456);
		System.out.println("Updated Content: " + integerBox.getContent());
		
		// Raw Types can be used
		Box rawBox =  new Box<Double>(46.87);
		System.out.println(rawBox);
		System.out.println("Content: " + rawBox.getContent());
		
		/*
		Box<Integer> rawBoxNotWork =  new Box(8.65);
		System.out.println(rawBoxNotWork);
		Integer element  = rawBoxNotWork.getContent();
		System.out.println("Content: " + element);
		*/
		
	}
}
