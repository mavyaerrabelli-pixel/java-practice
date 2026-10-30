package com.loops;

import java.util.Scanner;

public class EvenorOdd {
	static void display(int n) {
		for (int i = 0; i <= n; i++) {
			if(i!=0 && i%2==0) {
				System.out.print(i + " ");
			}
		}
		for (int i = 0; i <= n; i++) {
			if(i!=0 && i%2==1) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		display(a);
		sc.close();

	}

}
