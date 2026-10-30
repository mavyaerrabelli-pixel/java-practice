package com.logicalstatements;

import java.util.Scanner;

public class divisibleby5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		if(num %5 == 0){
			System.out.println("Divisible of 5");
		}else{
			System.out.println("It is not a divisible ");
		}
        sc.close();
	}

}
