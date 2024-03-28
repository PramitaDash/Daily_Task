package com.java.java;

public class PrimeOrnot {
	public static void main(String[] args) {
		int num= 13, count=0;
		
		if(num<0) {
			System.out.println("number is not prime");
		}
		
		for(int i =1; i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
	}

}
