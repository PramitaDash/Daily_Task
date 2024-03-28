package com.java.tod;

public class SunnyNumber {
	static boolean isPerfectSquare(double x) {
		double sr = Math.sqrt(x);
		return((sr - Math.floor(sr))== 0);
	}
	static void chechSunnyNumber(int N ) {
		
		//check if(N+1) is a perfect square or not
		if(isPerfectSquare(N+1)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		int N =8;
		chechSunnyNumber(N);
	}
	
}
