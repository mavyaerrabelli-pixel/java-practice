package com.arrays;

public class LargestElement {

	public static void main(String[] args) {
		int[] array = { 12, 45, 7, 89, 23 };
		int largest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];

			}

		}
		System.out.println("largest number:" + largest);
	}

}
