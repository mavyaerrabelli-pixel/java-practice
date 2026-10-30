package com.constructors;

import java.util.Scanner;

public class Student {
	
	String StudentName;
	double RollNumber;
	int Marks1;
	int Marks2;
	int Marks3;
	
	Student(String StudentName,Double RollNumber,int Marks1, int Marks2,int Marks3){
		
		this.StudentName = StudentName;
		this.RollNumber = RollNumber;
		this.Marks1 = Marks1;
		this.Marks2 = Marks2;
		this.Marks3 = Marks3;
		calculate();
		
	}
	
	void calculate() {
		 double TotalMarks =  Marks1 + Marks2 + Marks3;
		 double Average = TotalMarks/3;
		
		System.out.println("student name :"+ StudentName);
		System.out.println("Roll Number :"+ RollNumber);
		System.out.println(" Subject1 :"+ Marks1);
		System.out.println(" Subject2 :"+ Marks2);
		System.out.println(" Subject3 :"+ Marks3);
		System.out.println("Total Marks :"+ TotalMarks);
		System.out.println("average :"+ Average);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the StudentName:");
		String StudentName = sc.nextLine();
		System.out.println("Enter RollNumber:");
		double RollNumber = sc.nextDouble();
		System.out.println("Enter Marks1:");
		int Marks1 = sc.nextInt();
		System.out.println("Enter Marks2:");
		int Marks2 = sc.nextInt();
		System.out.println("Enter Marks3:");
		int Marks3 = sc.nextInt();
		
		Student s = new Student(StudentName,RollNumber,Marks1,Marks2,Marks3);

	}

}
