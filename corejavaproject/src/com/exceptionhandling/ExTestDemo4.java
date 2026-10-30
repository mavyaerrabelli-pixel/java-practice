package com.exceptionhandling;

import java.util.Scanner;

public class ExTestDemo4 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Amount:");
			String str = sc.nextLine();
			double a = Integer.parseInt(str);
			System.out.println(a);

		} catch (NumberFormatException NE) {
			System.err.println("in catch1 NE");

		}
		try {
			System.out.println("Enter a index value from 0 to 4:");
			int i = sc.nextInt();
			System.out.println(arr[i]);
		} catch (ArrayIndexOutOfBoundsException AE) {
			System.err.println("in catch2 AE");

		}
		try {
			System.out.println("Enter account HolderName:");
			String Name = sc.nextLine();
			
			
			System.out.println("Account HOldeName"+Name);
		} catch (NullPointerException NPE) {
			System.out.println("in catch3 NPE");

		}

	}

}
