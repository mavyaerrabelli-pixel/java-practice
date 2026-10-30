package com.logicalstatements;

import java.util.Scanner;

public class Oper {
	static void addition(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum is:" + sum);
	}

	static void Subtraction(int num1, int num2) {
		int diff = num1 - num2;
		System.out.println("Sum is:" + diff);
	}

	static void Division(int num1, int num2) {
		int Div = num1 / num2;
		System.out.println("Sum is:" + Div);
	}

	static void Multiplication(int num1, int num2) {
		int Mul = num1 * num2;
		System.out.println("Sum is:" + Mul);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num12 = sc.nextInt();

		System.out.println("Enter num2:");
		int num13= sc.nextInt();

		System.out.println(
				"Enter an operator to be performed \n1.Addition\n 2.Subtraction\n 3.Division\n 4.Multiplication\n");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			addition(num12, num13);
			break;
		case 2:
			Subtraction(num12, num13);
			break;
		case 3:
			Division(num12, num13);
			break;
		case 4:
			Multiplication(num12, num13);
			break;
		default:
			System.out.println("invalid from the list");

		}

	}

}
