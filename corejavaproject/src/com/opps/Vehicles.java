package com.opps;

class Vehicles1 {
	int speed = 50;

	void display() {
		System.out.println("Vehicle speed is:" + speed);
	}
}

class car extends Vehicles1 {
	int speed = 100;

	void display() {
		System.out.println("car speed is:" + speed);
	}

}

public class Vehicles{

	public static void main(String[] args) {
		Vehicles1 v = new car();
		System.out.println("speed:" + v.speed);
		
		v.display();

	}

}
