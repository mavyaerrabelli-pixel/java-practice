package myproject;

public class Hello {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("main method started!");
		//class loader is loading below class
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		
		System.out.println("main method ended!");
	}

}
