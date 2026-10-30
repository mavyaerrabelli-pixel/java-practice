package com.logicalstatements;

import java.util.Scanner;

public class InsuranceEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age = sc.nextInt();

		if (age >= 60) {
			System.out.println("You are not eligible to take an insurance");
		} else {
			System.out.println("Eligible for Insurance");
		}
		sc.close();
	}

}
