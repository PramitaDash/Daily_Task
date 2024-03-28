package com.java.tod;

import java.util.Scanner;

//9=9^2=81==8+1=9
public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();//9
		int m =n;
		int p = n* n;//81
		int sum =0;
		while(p!=0) {
			int r = n%10;//81-8
			sum = sum + r;//1+8=9
			p=p/10;//8
		}
		if(sum==n) {
			System.out.println("neon number");
		}
		else {
			System.out.println("not neon number");
		}
		
	}

}
