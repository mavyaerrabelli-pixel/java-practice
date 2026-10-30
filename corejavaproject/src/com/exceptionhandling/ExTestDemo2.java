package com.exceptionhandling;

import java.util.Scanner;

public class ExTestDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50 };

		try {
			System.out.println("Enter an index 0 to 4:");
			int i = sc.nextInt();
			System.out.println(arr[i]);
		} catch (ArrayIndexOutOfBoundsException AE) {
			System.err.println("in AE");
			
			System.out.println(AE.getMessage());
		}

	}

}
