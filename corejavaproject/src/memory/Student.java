package memory;

public class Student {
	int id;
	int age;
	String Name;
	String address;

	static int collegeid = 555;
	static String collegeName = "Vcube";

	public static void main(String[] args) {
		System.out.println("Student info");
		System.out.println("****Object1****");

		Student S1 = new Student();
		S1.id = 186;
		S1.age = 22;
		S1.Name = "Mavya";
		S1.address = "Hanamkonda";
		System.out.println("Student collegeid:" + collegeid);
		System.out.println("Student collegeName:" + collegeName);
		System.out.println("Student id:" + S1.id);
		System.out.println("Student age:" + S1.age);
		System.out.println("Student name:" + S1.Name);
		System.out.println("Student :" + S1.id);
		System.out.println("Student Address:" + S1.address);

		System.out.println("****Object2****");

		Student S2 = new Student();
		S2.id = 187;
		S2.age = 22;
		S2.Name = "pooja";
		S2.address = "Adilbad";
		System.out.println("Student collegeid:" + collegeid);
		System.out.println("Student collegeName:" + collegeName);
		System.out.println("Student id:" + S2.id);
		System.out.println("Student age:" + S2.age);
		System.out.println("Student name:" + S2.Name);
		System.out.println("Student :" + S2.id);
		System.out.println("Student Address:" + S2.address);

	}

}
