package com.igniquest.corejava.basics;

public class StaticVariableExample {
	// Static variable shared among all instances of StaticExample class
    static int staticVar = 0;

    // Instance variable
    int instanceVar;

    // Constructor to initialize instance variable
    public StaticVariableExample(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    // Static method to increment staticVar
    public static void incrementStaticVar() {
        staticVar++;
    }

    // Method to display instanceVar and staticVar
    public void display() {
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
    }

    public static void main(String[] args) {
        // Creating instances of StaticExample
    	StaticVariableExample obj1 = new StaticVariableExample(10);
    	StaticVariableExample obj2 = new StaticVariableExample(20);
        // Calling static method using class name
    	StaticVariableExample.incrementStaticVar();

        // Displaying values of instanceVar and staticVar for obj1
        System.out.println("Object 1:");
        obj1.display();

        // Displaying values of instanceVar and staticVar for obj2
        System.out.println("\nObject 2:");
        obj2.display();
    }
}
