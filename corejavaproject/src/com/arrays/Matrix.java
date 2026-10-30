package com.arrays;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] array = new int[3][3];
		System.out.println("Enter the Elements to the Matrix:");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j] + " ");
			}

			System.out.println();
		}

		sc.close();
	}
}
