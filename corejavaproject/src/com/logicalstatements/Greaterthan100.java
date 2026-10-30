package com.logicalstatements;

import java.util.Scanner;

public class Greaterthan100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		float Num = sc.nextFloat();

		if (Num > 100) {
			System.out.println("The given Number is greater than 100");
		} else {
			System.out.println("The given number is less than 100");
		}
		sc.close();

	}

}
