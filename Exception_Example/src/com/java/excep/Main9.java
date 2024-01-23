package com.java.excep;

public class Main9 {
	
	public static void main(String[] args) {
		Object[] intArray = new Integer[6];
		
		try {
			intArray[0] = "Hello, Hi";
			System.out.println("Successfully stored: " +intArray[0]);
		}catch (ArrayStoreException e) {
			System.out.println("ArrayStoreException: "+ e.getMessage());
		}
		}

}
