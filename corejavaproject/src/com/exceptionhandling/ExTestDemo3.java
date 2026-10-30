package com.exceptionhandling;

import java.util.Scanner;

public class ExTestDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter a Number:");
		String s = sc.nextLine();
		
		
		int num = Integer.parseInt(s);
		
			System.out.println(s);
		} catch (NumberFormatException NE) {
			System.err.println("in NE");
			System.out.println(NE.getMessage());
		}

	}

}
