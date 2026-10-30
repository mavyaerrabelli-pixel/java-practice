package com.logicalstatements;

import java.util.Scanner;

public class UppercaseorLowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphabet:");
		char ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("The given alphabet is UpperCase");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("The given alphabet is Lowercase");
		} else {
			System.out.println("Invalid entry. Enter an Alphabet");
		}
		sc.close();
	}

}
