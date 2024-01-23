package com.java.excep;

public class Main2 {
	public static void main(String[] args) {
		try {
			int a = 4/0;
			
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException :" + e.getMessage());
		}
		finally {
			System.out.println("This is the finally block");
		}
	}

}
