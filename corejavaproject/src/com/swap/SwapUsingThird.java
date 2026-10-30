package com.swap;

import java.util.Scanner;

public class SwapUsingThird {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1:");
		int a = sc.nextInt();
		System.out.println("Enter n2:");
		int b = sc.nextInt();

		int temp = a;
		a = b;
		b = temp;

		System.out.println("Value of A :" + a);
		System.out.println("Value of B:" + b);

	}


}
