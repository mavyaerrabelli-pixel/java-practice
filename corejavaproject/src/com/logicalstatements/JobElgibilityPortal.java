
package com.logicalstatements;

import java.util.Scanner;

public class JobElgibilityPortal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Full Name:");
		String FName = sc.nextLine();

		System.out.println("Enter your Qualification:");
		String Qualification = sc.nextLine();

		if (Qualification.equalsIgnoreCase("Btech") || Qualification.equalsIgnoreCase("BE")) {

			System.out.println("Enter your Year of PassOut:");
			int YOP = sc.nextInt();
			sc.nextLine();

			if (YOP >= 2022 && YOP <= 2027) {

				System.out.println("Enter your Branch:");
				String Branch = sc.nextLine();

				if (Branch.equalsIgnoreCase("CSE") || Branch.equalsIgnoreCase("CSM") || Branch.equalsIgnoreCase("CSD")
						|| Branch.equalsIgnoreCase("ECE")) {

					System.out.println("Enter your Percentage:");
					float Percentage = sc.nextFloat();
					sc.nextLine();

					if (Percentage >= 60 && Percentage <= 100) {

						System.out.println("Enter your Skills:");
						String skills = sc.nextLine();

						if (skills.equalsIgnoreCase("java") || skills.equalsIgnoreCase("python")) {

							System.out.println("Enter your Experience:");
							int Experience = sc.nextInt();

							if (Experience >= 0 && Experience <= 1) {
								System.out.println("Congratulations " + FName);
								System.out.println("You are Eligible for this role");
							} else {
								System.out.println("You are not eligible: Experience must be 0-1 years");
							}

						} else {
							System.out.println("You are not eligible: Java or Python skill is required");
						}

					} else {
						System.out.println("You are not eligible: Percentage must be between 60 and 100");
					}

				} else {
					System.out.println("Only CSE (sub-branches) and ECE are eligible for this role");
				}

			} else {
				System.out.println("You are not eligible: Pass-out year must be between 2022 and 2027");
			}

		} else {
			System.out.println("You are not eligible: Qualification criteria not met");
		}

		sc.close();
	}
}
