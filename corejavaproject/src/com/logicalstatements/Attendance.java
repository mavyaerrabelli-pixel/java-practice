package com.logicalstatements;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Attendance Percentage:");
		int attendance = sc.nextInt();
		
		if(attendance >= 75) {
			System.out.println("Eligible to write exams");
		}else {
			System.out.println("Not Eligible to write exams");
		}
		sc.close();
	}

}
