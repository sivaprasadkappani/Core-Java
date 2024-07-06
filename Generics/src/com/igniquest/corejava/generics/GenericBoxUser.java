package com.igniquest.corejava.generics;

public class GenericBoxUser {

	public static void main(String[] args) {
		GenericBox<String> stringBox = new GenericBox<>();
		GenericBox<Integer> integerBox = new GenericBox<>();
		GenericBox<Number> numberBox = new GenericBox<>();
		
		stringBox.setItem( "Test"); 
//		stringBox.setItem(new Integer(123)); 
		integerBox.setItem( 123 ); 
		
		numberBox.setItem( 123 ); // Integer is a subclass of Number
		//integerBox.setItem( new Number(123) ); // Compilation error: Number is not a subclass of Integer
		
		//GenericBox<? Integer> numberBox = new GenericBox<>();

	}

}
