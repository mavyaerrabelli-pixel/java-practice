package com.exceptionhandling;

import java.util.Scanner;

public class ExTestdemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter your Age:");
			int age = sc.nextInt();
			if (age < 18) {
				throw new InvalidAgeException("Age must be 18 or above");
			} else {
				System.out.println("registration Successful");
			}
		} catch (InvalidAgeException e) {

		}
	}

}