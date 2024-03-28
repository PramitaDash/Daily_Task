package com.java.pro;

import java.util.Scanner;

public class AutobiographicalNumber {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int num = sc.nextInt();
		num = Math.abs(num);
		int n = num;
		String str = String.valueOf(num);
		int digitarray[] = new int[str.length()];
		for(int i = digitarray.length-1;i>=0;i--) {
			digitarray[i] = n%10;
			n= n/10;
		}
		boolean flag = true;
		for(int i =0;i<digitarray.length;i++) {
			int count = 0;
			for(int j =0;j<digitarray.length;j++) {
				if(i == digitarray[i])
					count++;
			}
			if(count != digitarray[i]) {
			flag = false;
			break;
			}
		}
		if(flag)
			System.out.println(num+ " is an autobiographical number");
		else 
			System.out.println(num + " is not an autobiographical number");
		
	}

}
