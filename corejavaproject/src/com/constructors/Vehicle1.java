package com.constructors;

class Vehicle {
	String type;

	Vehicle(String type) {
		this.type = type;
	}
}

class car extends Vehicle {
	String brand;
	double price;

	car(String type, String brand, double price) {
		super(type);
		this.brand = brand;
		this.price = price;

	}
}

class ElectricCar extends car {
	double batteryCapacity;

	ElectricCar(String type, String brand, double price, double batteryCapacity) {
		super(type, brand, price);
		this.batteryCapacity = batteryCapacity;
	}

	void display(String type, String brand, double price, double batteryCapacity) {
		System.out.println("Type of the Vehicle is:" + type);
		System.out.println("Brand of the Vehicle is:" + brand);
		System.out.println("Price of the Vehicle is:" + price);
		System.out.println("BatteryCapacity of the Vehicle is:" + batteryCapacity+"kwh");
	}

}
	public class Vehicle1 {
		public static void main(String[] args) {
			ElectricCar ec = new ElectricCar("Electric", "Tesla", 80000000, 95);
			ec.display("Electric","Tesla",80000000,95);

		}
	}

