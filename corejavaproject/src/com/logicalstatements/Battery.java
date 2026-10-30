package com.logicalstatements;

import java.util.Scanner;

public class Battery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your battery percentage:");
		int battery = sc.nextInt();
		
		if(battery <= 20) {
			System.out.println("Battery is low ");
			System.out.println("Charge Your Mobile");
		}
		else {
			System.out.println("Battery is more than 20 percentage");
		}
       sc.close();
	}

}
