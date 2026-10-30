package com.loops;

import java.util.Scanner;

public class ReverseAlphabets {
	static void display(char n) {
		for (char i = n; i >= 'A'; i--) {
			System.out.println(i);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
		char a = sc.next().charAt(0);
		display(a);
	}

}
