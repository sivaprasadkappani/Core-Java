package com.igniquest.corejava.basics.package2;

import com.igniquest.corejava.basics.access.package1.MyBaseClass;

public class SubclassAnotherPackage extends MyBaseClass {

	public void disaplyVariablesFromDerivedClass() {

		// Subclass - Another Package : default & private not available
		System.out.println("Public variable: " + publicVar);
		System.out.println("Protected variable: " + protectedVar);
		// System.out.println("Default variable: " + defaultVar);
		// System.out.println("Default variable: " + privateVar);

	}

}