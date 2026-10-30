package com.logicalstatements;

import java.util.Scanner;

public class DivisibleBy3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();

		if (a % 3 == 0) {
			System.out.println("Divisible by 3");
		} else {
			System.out.println("It is not divisible by 3");
		}
		sc.close();
	}

}
