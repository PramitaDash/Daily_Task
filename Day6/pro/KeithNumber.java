package com.java.pro;

import java.util.ArrayList;
import java.util.Collections;


public class KeithNumber {
	static boolean isKeith(int x) {
		ArrayList<Integer> term = new ArrayList<Integer>();
		int temp =x, n=0;
		while(temp>0) {
			term.add(temp%10);
			temp =temp/10;
			n++;
		}
		
		Collections.reverse(term);
		int next_term = 0,i=n;
		while(next_term<x) {
			next_term = 0;
			for(int j =1;j<=n;j++)
				next_term =next_term + term.get(i-j);
			term.add(next_term);
			i++;
		}
		
		return(next_term == x);
		
	}
	public static void main(String[] args) {
		if(isKeith(19))
			System.out.println("Yes, the given number is a keith number");
		else
			System.out.println("No, the given number is not a keith number");
		if(isKeith(742))
			System.out.println("Yes, the given number is a keith number");
		else 
			System.out.println("No, hte given numver is not a keith number");
		if(isKeith(4578))
			System.out.println("Yes,the given number is a keith number");
		else 
			System.out.println("No, the given number is not a keith number");
	}


}




