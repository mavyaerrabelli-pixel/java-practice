package com.logicalstatements;

import java.util.Scanner;

public class TaxCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Annual Income:");
		double Income = sc.nextDouble();
		double tax;

		if (Income <= 250000) {
			tax = 0;
		} else if (Income <= 500000) {
			tax = Income * 5 / 100;
		} else if (Income <= 1000000) {
			tax = Income * 20 / 100;
		} else {
			tax = Income * 30 / 100;
		}
		System.out.println("Income Tax is:" + tax);
		sc.close();
	}

}
