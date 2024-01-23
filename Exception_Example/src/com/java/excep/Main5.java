package com.java.excep;

public class Main5 {
	public static void main(String[] args) {
		int a = 7;
		int b = 0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
	}

}
