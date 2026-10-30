package com.methods;

import java.util.Scanner;

public class TestDemo3 {
	
	void add (int a , int b) {
		
		System.out.println("sum is:" +(a+b));
		
		}
	void sub(double a, double b) {
		System.out.println("Subtraction is:"+(a-b));
		
	}
	
	void multi(double a , double b) {
		System.out.println("Product is:"+(a*b));
	}
	
	void div(double a, double b) {
		System.out.println("Division is:"+(a/b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		
		TestDemo3 t = new TestDemo3();
		t.add(a, b);
		t.sub(a, b);
		t.multi(a, b);
		t.div(a, b);
		

	}

}
