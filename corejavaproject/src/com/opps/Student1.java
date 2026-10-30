package com.opps;

import java.util.Scanner;

 class Student {
	void calculateGrade(int marks) {
		System.out.println("Grade Calculation");
	}

 }
	class EngineeringStudent extends Student {
		
		void calculateGrade(int marks) {
			if (marks > 90 && marks <= 100) {
				System.out.println("Grade-->A");
			} else if (marks > 75) {
				System.out.println("Grade-->B");
			} else if (marks > 60) {
				System.out.println("Grade-->C");
			} else if (marks > 50) {
				System.out.println("Grade-->D");
			} else if (marks > 35) {
				System.out.println("Grade-->E");
			} else if (marks < 35 && marks >= 0) {
				System.out.println("Fail-->F");
			} else {
				System.out.println("Invalid Entry");
			}

		}

	}

	class MedicalStudent extends Student {
		void calculateGrade(int marks) {
			if (marks > 90 && marks <= 100) {
				System.out.println("Grade-->A");
			} else if (marks > 70) {
				System.out.println("Grade-->B");
			} else if (marks > 55) {
				System.out.println("Grade-->C");

			} else if (marks >= 45) {
				System.out.println("Grade-->D");
			} else if (marks < 45 && marks >= 0) {
				System.out.println("Fail");
			} else {
				System.out.println("Invalid Entry");
			}
		}

	}

	class ManagementStudent extends Student {
		void calculateGrade(int marks) {
			if (marks > 85 && marks <= 100) {
				System.out.println("Grade-->A");
			} else if (marks > 70) {
				System.out.println("Grade-->B");
			} else if (marks > 60) {
				System.out.println("Grade-->C");
			} else if (marks > 50) {
				System.out.println("Grade-->D");
			} else if (marks >= 30) {
				System.out.println("Grade-->E");
			} else if (marks < 30 && marks >= 0) {
				System.out.println("Grade-->Fail");
			} else {
				System.out.println("Invalid Entry");
			}
		}

	}
 
	
	
public class Student1{

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Student Name:");
		String n = sc.nextLine();
		System.out.println("Enter the Student Marks:");
		int marks = sc.nextInt();
		System.out.println("Enter your choice of Department:");
		System.out.println("1--> For Engineering Student");
		System.out.println("2--> For Medical Student");
		System.out.println("3--> For Managemeent Student");
		int choice = sc.nextInt();
		
		
		switch(choice) {
		case 1:
			Student s =new EngineeringStudent();
			s.calculateGrade(marks);
			break;
		case 2:
			Student s1 = new MedicalStudent();
			s1.calculateGrade(marks);
			break;
		case 3:
			Student s2 = new ManagementStudent();
			s2.calculateGrade(marks);
			break;
		}
		

	}
}
 

