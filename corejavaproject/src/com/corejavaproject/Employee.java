package com.corejavaproject;

public class Employee {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object is destroyed");
	}

	public static void main(String[] args) {

		int a = 0x2a84aee7;
		System.out.println(a);

		Employee e1 = new Employee();
		System.out.println(e1);

		Employee e2 = new Employee();
		System.out.println(e2);

		Employee e3 = new Employee();
		System.out.println(e3);
		System.out.println(e3.hashCode());

		e1 = null;
		e2 = null;

		System.out.println(e1);
		System.out.println(e2);
		System.gc();

	}

}
