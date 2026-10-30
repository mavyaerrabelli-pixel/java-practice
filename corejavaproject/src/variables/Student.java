package variables;

public class Student {
//instance variables
	int sid;
	String sname;
//static variables
	static int collegeid;
	static String collegeName;

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("student information from vcube");
//accessing static data

		System.out.println(collegeid);
		System.out.println(collegeName);
//accessing the instance data
		int sid = 101;
		String sname = "Srinivas";
		Student srinu = new Student();
		System.out.println("StudentId:" + sid);
		System.out.println("Student name:" + sname);
	}

}
