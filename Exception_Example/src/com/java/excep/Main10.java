package com.java.excep;

public class Main10 {
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,4,6,7,8};
		
		try {
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException :" +e.getMessage());
		}
		
	}

}
