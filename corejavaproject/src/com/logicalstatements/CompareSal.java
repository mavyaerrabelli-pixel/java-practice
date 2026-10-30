package com.logicalstatements;

import java.util.Scanner;

public class CompareSal {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person A salary:");
		double a = sc.nextDouble();
		System.out.println("Enter Person B salary:");
		double b = sc.nextDouble();

		if (a > b) {
			System.out.println("Person a salary is Greater");

		} else if (a < b) {
			System.out.println("Person B Salary is greater");
		} else {
			System.out.println("Both salaries are same");
		}

		sc.close();
	}

}
