package com.java.java;

import java.util.Scanner;

public class Palindromnumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum=0;
		int temp = n;
		while(n!=0) {
			int rem = n % 10;
			sum = (sum * 10)+rem;
			n = n/10;
			
		}
		if(sum == temp) {
			System.out.println("palindrom number");
		}
		else {
			System.out.println("not a palindrom number");
		}
	}

}
