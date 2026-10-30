package com.operators;

import java.util.Scanner;

public class Ternaryop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st number:");
		int a = sc.nextInt();
		System.out.println("Enter your 2nd number:");
		int b = sc.nextInt();
		System.out.println("Enter the Operator:");
		char op = sc.next().charAt(0);
		int cal = (op == '+')? a+b : a-b;   
		
		System.out.println("The Result is :"+cal);
		sc.close();

	}

}
