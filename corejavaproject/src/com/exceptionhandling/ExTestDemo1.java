package com.exceptionhandling;

import java.util.Scanner;

public class ExTestDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		String str1 = sc.nextLine();
		System.out.println("Enter the Second Number:");
		String str2 = sc.nextLine();

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		try {
			int result = num1 / num2;
			System.out.println(result);
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException");

		}

	}

}
