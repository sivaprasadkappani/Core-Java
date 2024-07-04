package com.igniquest.corejava.io;

public class StylishMessageUser {
	 public static void main(String[] args) {
	        // Create a Message object
	        Message msg = new Message("Hello, world!");

	        // Create an instance of StylishMessage
	        StylishMessage stylishMsg = new StylishMessage(msg);

	        // Get and print the stylish message
	        System.out.println(stylishMsg.getMessage());
	    }
}
