package com.constructors;

import java.util.Scanner;

public class Patient {
	
	String PatientName;
	int Age;
	double RoomCharge;
	int DaysAdmitted;
	
	Patient(String PatientName, int Age, double RoomCharge, int DaysAdmitted ){
		
		this.PatientName = PatientName;
		this.Age = Age;
		this.RoomCharge = RoomCharge;
		this.DaysAdmitted = DaysAdmitted;
		display();
		
	}
	
	void display() {
		 double TotalHospitalBill = RoomCharge*DaysAdmitted;
		 System.out.println("Patient Name:"+PatientName);
		 System.out.println("Age of the Patient is:"+Age);
		 System.out.println("Room Charge Per Day is:"+RoomCharge);
		 System.out.println("Number of DAys admitted:"+DaysAdmitted);
		 System.out.println("Total Hospital Bill is:"+TotalHospitalBill);
	}
	

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Name of the Patient:");
		String PatientName = sc.nextLine();
		System.out.println("Enter Age of the Patient:");
		int Age = sc.nextInt();
		System.out.println("Enter the room Charge Per day:");
		double RoomCharge = sc.nextDouble();
		System.out.println("Enter No.Of Days Admitted:");
		int DaysAdmitted = sc.nextInt();
		
		Patient p = new Patient(PatientName, Age, RoomCharge,DaysAdmitted);
		
		
	}

}
