package com.java.tod;

import java.util.Scanner;

//146 =146 --- 
public class PetersonNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int m =n;
		int sum =0;
		while(n!=0) {
			int fact=1;
			int r = n%10;
			for(int i =1;i<=r;i++) {
			 fact = fact * i;
			}
			sum =sum + fact;
			n =n/10;
		}
		if(sum == m) {
			System.out.println("Peterson Number: ");
		}
		else {
			System.out.println("Not Pererson Number: ");
		}
		
		
	}

}
