package com.logicalstatements;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enyer Your salary:");
		double sal = sc.nextDouble();

		double bonus;

		if (sal <= 20000) {
			bonus = sal * 5 / 100;
		} else if (sal <= 30000) {
			bonus = sal * 10 / 100;
		} else if (sal <= 50000) {
			bonus = sal * 15 / 100;
		} else if (sal <= 800000) {
			bonus = sal * 20 / 100;
		} else {
			bonus = sal * 25 / 100;
		}
		System.out.println("employee Bonus is:" + bonus);
		sc.close();
	}

}
