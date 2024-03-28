package com.java.java;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int num = 153, res =0, n =3, org;
		org = num;
//		while(org!=0) {
//			n++;
//		}
//		org = num;
		while(org != 0) {
			int rem =num%10;
			res= (int) (res+Math.pow(rem, n));
			num = num/10;
		}
		
		if(res == num) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not an Armstrong number");
		}
	}
	

}
