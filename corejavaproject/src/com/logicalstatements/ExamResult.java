package com.logicalstatements;

import java.util.Scanner;

public class ExamResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Marks:");
		int Marks = sc.nextInt();
		
		if(Marks >=35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
			System.out.println("Better Luck NextTime!!");
		}
		sc.close();

	}

}
