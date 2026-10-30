package com.logicalstatements;

import java.util.Scanner;

public class PasswordCheck {
	static String Password = "Mavya123";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password:");
		String a = sc.nextLine();
	

		if (Password.equals(a)) {
			System.out.println("valid Password");
		} else {
			System.out.println("Invalid Password");
		}
		sc.close();

	}

}
