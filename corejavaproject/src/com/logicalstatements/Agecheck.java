package com.logicalstatements;

import java.util.Scanner;

public class Agecheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int Age = sc.nextInt();
		
		if(Age >= 60) {
			System.out.println("OldgAge");
		}
		else if(Age >= 35){
			System.out.println("Middle age");
			
		}
		else if(Age >= 20) {
			System.out.println("Young age");
		}
		else if(Age >= 13) {
			System.out.println("TeenAge");
		}
		else {
			System.out.println("Kids");
		}
		sc.close();
	}

}
