package com.logicalstatements;

import java.util.Scanner;

public class BusTicketFare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = sc.nextInt();

		if (age >= 15) {
			System.out.println("Tickect Fare is 25");
		} else if (age >= 5) {
			System.out.println("Ticket Fare is 20");
		} else {
			System.out.println("No Fare");
		}
		sc.close();
	}

}
