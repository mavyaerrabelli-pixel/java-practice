package com.logicalstatements;

import java.util.Scanner;

public class PosorNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number:");
		int Num = sc.nextInt();
		 
		if(Num >= 0) {
			
			System.out.println("It is a Positive Integer");
			
		}
		else{
			
			System.out.println("It is a Negative Number");
		}
		sc.close();

	}

}
