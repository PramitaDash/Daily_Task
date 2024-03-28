package com.java.java;

public class ReverceNumber {
	public static void main(String[] args) {
		int num=23,sum=0,rev;
	
		while(num!=0) {
			rev = num %10;
			sum =(sum *10)+ rev;
			num =num/10;
		}
		System.out.println(sum);
	}

}
