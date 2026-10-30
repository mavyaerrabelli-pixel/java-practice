package com.methods;

public class TestDemo2 {


	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		TestDemo2 t = new TestDemo2 ();
		t.recharge (299.0);

	}
	void recharge(double amount) {
		System.out.println("Recharge method called");
		System.out.println("Recharge Amount:" + amount);
		System.out.println("Recharge Successfull");
}
}