package com.logicalstatements;

import java.util.Scanner;

public class MinBalance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Account Balance: ");
		double bal = sc.nextDouble();
		
		if(bal >= 1000) {
			System.out.println("Account have min balace");
		}
		else {
			System.out.println("less than thousand");
			System.out.println("Maintain minimum balance");
		}
      sc.close();
	}

}
