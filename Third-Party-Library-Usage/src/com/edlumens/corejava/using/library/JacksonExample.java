package com.edlumens.corejava.using.library;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonExample {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		// Create a sample object
		User user = new User("Alice", 30);

		// Convert the object to JSON
		String jsonString = mapper.writeValueAsString(user);
		System.out.println("Serialized JSON: " + jsonString); 

		// Convert the JSON back to an object
		User deserializedUser = mapper.readValue(jsonString, User.class);
		System.out.println("Deserialized Object: " + deserializedUser);
	}

}