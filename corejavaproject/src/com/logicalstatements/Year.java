package com.logicalstatements;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year:");
		float year = sc.nextFloat();
		 
		if(year >= 2001) {
			System.out.println("After Two Thousand's");
		}
		else {
			System.out.println("Not in two thousand's");
		}
          sc.close();
	}

}
