package com.igniquest.corejava.basics.access.package1;

public class SubclassSamePackage extends MyBaseClass {
    // Constructor
    public SubclassSamePackage() {
       
    }
    
    public void disaplyVariablesFromDerivedClass() {
      
    	// Subclass - Same Package : private not available
        System.out.println("Public variable: " + publicVar);
        System.out.println("Protected variable: " + protectedVar);  
        System.out.println("Default variable: " + defaultVar);
        //System.out.println("Default variable: " + privateVar);
    
    }
    
}