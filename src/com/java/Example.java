package com.java;

public class Example {

	static int a;
	
	public static int demo() {

		a = 25;
		return a;
		
	//	a = 50;//we can't change the variable value after return to the method
	}
	
	public static void main(String[] args) {
		
		demo();
	}
}
