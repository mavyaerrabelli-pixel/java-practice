package com.methods;

import java.util.Scanner;

public class EmployeeSalary {
	void salarySlip(String employeeName, double BasicSalary) {
		 double HRA = BasicSalary * 20 / 100;
		 double DA = BasicSalary * 10 / 100;
		 double GrossSalary = BasicSalary + HRA + DA;
		 
		 System.out.println("HRA (20%):" +HRA);
		 System.out.println("DA(10%):" +DA);
		 System.out.println("The GrossSalary is:" +GrossSalary); 
	    
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Employee Name:");
		 String EmployeeName = sc.nextLine();
		 System.out.println("Basic Salary:");
		 double BasicSalary = sc.nextDouble();
		
		 EmployeeSalary e = new EmployeeSalary();
		 e.salarySlip(EmployeeName, BasicSalary);

	}

}
