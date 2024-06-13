package com.igniquest.corejava.generics;

//Generic Box class definition
public class Box<T> {
	private T content;

	// Constructor
	public Box(T content) {
		this.content = content;
	}

	// Getter method
	public T getContent() {
		return content;
	}

	// Setter method
	public void setContent(T content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Box{" + "content=" + content + '}';
	}
}


