package com.datatypes;

public class TestDataTypesDemo1 {
	int Employeeid = 101;
	char Egrade = 'A';
	int Esal = 234567;
	boolean isPermanent = true;
	int Eexperience = 3;
	int Eworkingdays = 5;
	long Epno = 9988765464L;
	int Ebonus = 65000;
	public static void main(String[] args) {
		TestDataTypesDemo1 t1 = new TestDataTypesDemo1();
	   
		System.out.println("Employeeid:"+t1.Employeeid);
		System.out.println("Employeegrade:"+t1.Egrade);
		System.out.println("Employeesalary:"+t1.Esal);
		System.out.println("Employee Permanent:"+t1.isPermanent);
		System.out.println("Employee Experience(in years):"+t1.Eexperience);
		System.out.println("Employee Working Days:"+t1.Eworkingdays);
		System.out.println("Employee PhoneNumber:"+t1.Epno);
		System.out.println("Employee Bonus Amount:"+t1.Ebonus);
	}

}
