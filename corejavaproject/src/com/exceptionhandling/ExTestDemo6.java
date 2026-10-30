package com.exceptionhandling;

import java.util.Scanner;

public class ExTestDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "Mavya";
		try {
			System.out.println("Enter UserName:");
			String username = sc.nextLine();
			if (username.equals(s)) {
				throw new DuplicateUsernameException("User Already Exists");
			} else {
				System.out.println("Account created Successfully");
			}
		} catch (DuplicateUsernameException DE) {
			System.out.println(DE);

		}
	}

}
