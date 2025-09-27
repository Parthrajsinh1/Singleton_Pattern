package com.singleton;

class single{
	
	private static single ref=null;
	
	// step-1: make the ctor as private
	private single() {
		System.out.println("inside ctor");
	}
	
	// step-2 : Design a method that will return the instance of this class
	public static single getInstance() {
		
		// step-3 : check for of the object is already created
		if(ref==null)
			ref = new single();
		return ref;
	}
}

public class Singleton{
	public static void main(String [] args) {
		
		single s = single.getInstance();
		single s1 = single.getInstance();
		single s2 = single.getInstance();
	}
}