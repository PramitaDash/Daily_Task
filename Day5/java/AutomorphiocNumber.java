package com.java.java;

public class AutomorphiocNumber {
	public static void main(String[] args) {
		int n = 25;
		int temp =n;
		int w = n*n;
		int flag =0;
		while(n!=0) {
			int r= n%10;
			int q = w%10;
			if(r==q) {
				flag = 1;
			}
			n =n/10;
			w = w/10;
		}
		if(flag == 0) {
			System.out.println("Automorphid number");
		}
		else {
			System.out.println("Not an automorphic number");
		}
	}

}
