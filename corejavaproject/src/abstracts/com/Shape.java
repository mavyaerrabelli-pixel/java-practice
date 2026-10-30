package abstracts.com;

import java.util.Scanner;

abstract class Shape1 {
	abstract void area();
}

class Circle extends Shape1 {
	double radius;

	Circle(double radius) {
		this.radius = radius;

	}

	void area() {
		double result = Math.PI * radius * radius;
		System.out.println("Area of the circle =" + result);
	}
}

class Rectangle extends Shape1 {
	double length, breadth;

	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	void area() {
		double result = length * breadth;
		System.out.println("Area of Rectangle = " + result);
	}
}

class Triangle extends Shape1 {
	double base, height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	void area() {
		double result = 0.5 * base * height;
		System.out.println("Area of the Triangle = " + result);
	}
}

public class Shape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius of circle:");
		double radius = sc.nextDouble();
		System.out.println("Enter length of the Rectangle:");
		double length = sc.nextDouble();
		System.out.println("Enter breadth of the Rectangle:");
		double breadth = sc.nextDouble();
		System.out.println("Enter the base of the Triangle :");
		double base = sc.nextDouble();
		System.out.println("Enter heigth of the Triangle:");
		double height = sc.nextDouble();

		Shape1 s;

		s = new Circle(radius);
		s.area();

		s = new Rectangle(length, breadth);
		s.area();

		s = new Triangle(base, height);
		s.area();

	}

}
