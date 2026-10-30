package com.logicalstatements;

import java.util.Scanner;

public class ParkingFee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Parking Time:");
		int Time = sc.nextInt();

		if (Time <= 2) {
			System.out.println("Parking Fee is 20");
		} else if (Time <= 3) {
			System.out.println("Parking fee is 50");
		} else if (Time <= 5) {
			System.out.println("Parking Fee is 70");
		} else {
			System.out.println("Parking fee is 90");
		}
		sc.close();
	}

}
