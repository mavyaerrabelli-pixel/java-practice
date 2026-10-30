package myproject;

public class Employee {

	static String companyName;
	static String location;

	String employeeName;
	double salary;
	int employeeid;

	// Static block
	static {
		companyName = "Vcube";
		location = "Hederabad";

		System.out.println("companyName:" + companyName);
		System.out.println("Location:" + location);

	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.employeeName = "Mavya";
		e1.salary = 80000;
		e1.employeeid = 101;
		System.out.println("EmployeeName:" + e1.employeeName);
		System.out.println("Salary:" + e1.salary);
		System.out.println("employeeId:" + e1.employeeid);

		Employee e2 = new Employee();
		e2.employeeName = "haritha";
		e2.salary = 85000;
		e2.employeeid = 102;
		System.out.println("EmployeeName:" + e2.employeeName);
		System.out.println("Salary:" + e2.salary);
		System.out.println("employeeId:" + e2.employeeid);

	}

}
