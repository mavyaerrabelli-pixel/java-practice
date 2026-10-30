package com.operators;

import java.util.Scanner;

public class PosorNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		String result = (num>0)? "positive":"Negative";
		System.out.println(result);
	}

}
