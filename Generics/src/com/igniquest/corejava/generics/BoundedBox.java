package com.igniquest.corejava.generics;

 
public class BoundedBox<T extends Number> {
 private T value;

 public void setValue(T value) {
     this.value = value;
 }

 public T getValue() {
     return value;
 }

 public double square() {
     // Using Number methods safely due to the bounded type parameter
     double num = value.doubleValue();
     return num * num;
 }

 public static void main(String[] args) {
     // Creating instances of Box with different types
	 BoundedBox<Integer> intBox = new BoundedBox<>();
     intBox.setValue(5);
     System.out.println("Square of " + intBox.getValue() + " is " + intBox.square());

     BoundedBox<Double> doubleBox = new BoundedBox<Double>();
     doubleBox.setValue(2.5);
     System.out.println("Square of " + doubleBox.getValue() + " is " + doubleBox.square());

     // This won't compile because String does not extend Number
     // BoundedBox<String> stringBox = new BoundedBox<>();
     // stringBox.setValue("Hello");
 }
}
