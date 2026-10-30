package com.swap;

public class Swap {
	int a = 10;
	int b = 20;
	

	 void main(String[] args) {

		System.out.println("Values before Swapping");
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		
		System.out.println("Values after Swapping");
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Value of A after Swap is:"+a);
		System.out.println("Value of B after Swap is:"+b);
	}

}
