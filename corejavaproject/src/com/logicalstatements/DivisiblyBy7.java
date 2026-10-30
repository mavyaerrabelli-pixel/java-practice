package com.logicalstatements;

import java.util.Scanner;

public class DivisiblyBy7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();

		if (a % 7 == 0) {
			System.out.println("Divisible by 7");
		} else {
			System.out.println("not divisible by 7");
		}
		sc.close();

	}

}
