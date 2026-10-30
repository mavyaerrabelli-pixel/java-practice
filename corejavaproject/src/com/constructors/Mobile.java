package com.constructors;

import java.util.Scanner;

public class Mobile {
	String Brand;
	String Model;
	double price;
	
	

	public Mobile(String brand, String model, double price) {
		Brand = brand;
		Model = model;
		this.price = price;
		
	}
	
	void display() {
		
		double GST = (price * 18)/100;
		double FinalPrice = price + GST;
		System.out.println("mobile Brand is:"+Brand);
		System.out.println("mobile Model is:"+Model);
		System.out.println("mobile Price:"+price);
		System.out.println("GST:"+GST);
		System.out.println("Final Price:"+FinalPrice);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mobile Brand:");
		String Brand = sc.nextLine();
		System.out.println("Enter the Model:");
		String Model = sc.nextLine();
		System.out.println("enter the Price:");
		double price = sc.nextDouble();
		
		Mobile m = new Mobile(Brand, Model,price);
		m.display();

	}

}
