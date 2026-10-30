package com.logicalstatements;

import java.util.Scanner;

public class CrickerPlayerselection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player Runs:");
		float runs = sc.nextFloat();
		
		if(runs <= 5000) {
			System.out.println("Not Selected");
		}
		else {
			System.out.println("selected");
		}
	}

}
