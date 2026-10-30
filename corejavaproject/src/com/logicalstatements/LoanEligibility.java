package com.logicalstatements;

import java.util.Scanner;

public class LoanEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary:");
		double salary = sc.nextDouble();

		if (salary <= 25000) {
			System.out.println("Not Eligible for Loan");
		} else if (salary <= 50000) {
			System.out.println("Eligible for Loan upto 100000");
		} else if (salary <= 700000) {
			System.out.println("eligible for Loan upto 2500000 ");
		} else {
			System.out.println("Eligible for Loan upto 4000000");
		}
		sc.close();
	}

}
