package com.logicalstatements;

import java.util.Scanner;

public class Smallestof3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int a = sc.nextInt();
		System.out.println("Enter the second Number:");
		int b = sc.nextInt();
		System.out.println("Enter the Third Number:");
		int c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println("A is the Smallest Number");
		} else if (b < a && b < c) {
			System.out.println("B is the Smallest Number");
		} else {
			System.out.println("C is the Samllest Number");
		}
		sc.close();

	}

}
