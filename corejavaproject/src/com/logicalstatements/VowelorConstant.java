package com.logicalstatements;

import java.util.Scanner;

public class VowelorConstant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
		char a = sc.next().charAt(0);

		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'i' || a == 'o'
				|| a == 'u') {
			System.out.println("The given Alphabet is Vowel");
		} else {
			System.out.println("The given Alphabet is Constant");
		}
		sc.close();
	}

}
