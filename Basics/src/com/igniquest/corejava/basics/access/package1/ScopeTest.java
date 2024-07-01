package com.igniquest.corejava.basics.access.package1;

public class ScopeTest {
	  public static void main( String[] args ) {
		  
		    // Withing Package : Only private not available
		    MyBaseClass mbc = new MyBaseClass();
		    System.out.println( mbc.publicVar);
		    System.out.println( mbc.protectedVar);
	    	System.out.println( mbc.defaultVar);
	    //	System.out.println( mbc.privateVar);
	    	 
 	    
	}
}
