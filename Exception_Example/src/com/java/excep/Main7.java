package com.java.excep;

public class Main7 {
	
	static void checkAge(int age) {
		if(age <18) {
			throw new ArithmeticException("Access denied - you must be at least 18  year old.");
		}
		else {
			System.out.println("Access granted- you old enough!");
		}
	}
	
	public static void main(String[] args) {
		checkAge(15);
	}

}
