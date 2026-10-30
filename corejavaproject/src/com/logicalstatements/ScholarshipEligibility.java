package com.logicalstatements;

import java.util.Scanner;

public class ScholarshipEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentage");
		int p = sc.nextInt();

		if (p >= 75) {
			System.out.println("Eligible for Scholarship");
		} else {
			System.out.println("Not Eligible for Scholarship");
		}
		sc.close();
	}

}
