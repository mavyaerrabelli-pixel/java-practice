package com.logicalstatements;

import java.util.Scanner;

public class BloodDonation {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age = sc.nextInt();
		 if(age >= 18) {
			 System.out.println("Eligible for Blood Donation");
		 }
		 else {
			 System.out.println("Not Eligible for Blood Donation");
		 }
        sc.close();
	}

}
