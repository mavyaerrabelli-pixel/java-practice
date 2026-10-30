package com.logicalstatements;

import java.util.Scanner;

public class voteElgibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have Citizenship of India..?");
		boolean citizenship = sc.nextBoolean();

		if (citizenship) {
			System.out.println("Enter your Age:");
			int Age = sc.nextInt();

			if (Age >= 18) {
				System.out.println("Do you have VoterId..?");
				boolean doyouhaveVoterID = sc.nextBoolean();

				if (doyouhaveVoterID) {
					System.out.println("You're Eligible to vote");
				} else {
					System.out.println("Yor're not eligible to vote, Apply for VoterID");
				}
			} else {
				System.out.println("To Vote u should be 18 Years");
			}

		} else {
			System.out.println("You should have an Indian Citizenship to Vote");
		}

	}

}
