package com.logicalstatements;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Marks:");
		int m = sc.nextInt();

		if (m > 90) {
			System.out.println("Excellent - S");
		} else if (m > 80) {
			System.out.println("Good - A");
		} else if (m > 70) {
			System.out.println("Above Average - B");
		} else if (m > 60) {
			System.out.println("Average - C");
		} else if (m > 50) {
			System.out.println("Below Average - D");
		} else if (m > 35) {
			System.out.println("E");
		} else {
			System.out.println("Fail");
		}
		sc.close();
	}

}
