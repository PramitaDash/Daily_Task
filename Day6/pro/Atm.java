package com.java.pro;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		int balance = 100000, withdraw,deposit;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Automated teller machin");
			System.out.println("choose 1 for withdraw");
			System.out.println("choose 2 for deposit");
			System.out.println("choose 3 for check balance");
			System.out.println("choose 4 for EXIT");
			System.out.println("choose the operation you want to perform: ");
			
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter money to be withdrawn");
				withdraw = sc.nextInt();
				if(balance>= withdraw) {
					balance = balance - withdraw;
					System.out.println("Please collect your money");
				}else {
					System.out.println("Insufficient balance");
				}
				System.out.println("");
				break;
			case 2:
				System.out.println("Enter money to be deposited:");
				deposit = sc.nextInt();
				balance= balance + deposit;
				System.out.println("Balance: "+balance);
				System.out.println("your money has been successfully");
				break;
			case 3:
				System.out.println("Balance: "+balance);
				System.out.println("");
				break;
			case 4:
				System.exit(0);
			}
		}
	}

}
