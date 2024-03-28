package com.java.tod;

import java.util.Scanner;

//2025= 20+25=45^2=2025
public class TechNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();//2025
		int count =0;
		while(n>0) {
			count++;//1,2,3,4
			n=n/10;
		}
	if(count%2==0) {//4%2==0
			System.out.println("tech number");
		}
		else {
			System.out.println("not a tech number");
		}
	}

}

