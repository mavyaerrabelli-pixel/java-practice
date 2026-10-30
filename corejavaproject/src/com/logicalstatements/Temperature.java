package com.logicalstatements;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature:");
		int temp = sc.nextInt();
		
		if(temp >= 40) {
			System.out.println("High Temperature");
		}
		else if(temp >= 18) {
			System.out.println("Medium Temperature");
		}
		else {
			System.out.println("Low Temperature");
		}
		sc.close();

	}

}
