package com.logicalstatements;

import java.util.Scanner;

public class Greatestof2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Number:");
		int a = sc.nextInt();
		System.out.println("Enter your second Number:");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("A is the Greatest Number");

		} else {
			System.out.println("B is the Greatest Number");
		}
		sc.close();

	}

}
