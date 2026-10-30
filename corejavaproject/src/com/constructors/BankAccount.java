package com.constructors;

import java.util.Scanner;

public class BankAccount {
	String AccountHolderName;
	long AccountNumber;
	double Balance;
	String IFSCcode;
	
	public BankAccount(String accountHolderName, long accountNumber, double balance, String iFSCcode) {
		AccountHolderName = accountHolderName;
		AccountNumber = accountNumber;
		Balance = balance;
		IFSCcode = iFSCcode;
		display();
	}

	void display() {
		System.out.println("Account Holder Name:"+AccountHolderName);
		System.out.println("Account Number:"+AccountNumber);
		System.out.println("Balance:"+Balance);
		System.out.println("IFSCcode:"+IFSCcode);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Holder Name :");
		String AccountHolderName = sc.nextLine();
		System.out.println("Enter the Account Number:");
		long AccountNumber = sc.nextLong();
		System.out.println("Enter the Balance:");
		double Balance = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter IFSC Code:");
		String IFCScode = sc.nextLine();
		
		BankAccount b = new BankAccount( AccountHolderName,AccountNumber,Balance,IFCScode);
        

	}

}
