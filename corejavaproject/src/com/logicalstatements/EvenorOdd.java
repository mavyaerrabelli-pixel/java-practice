package com.logicalstatements;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int Num = sc.nextInt();
		
		if(Num%2 == 0) {
			System.out.println("It is a even Number");
		}
		else {
			System.out.println("It is a odd Number");
		}
		sc.close();

	}

}
