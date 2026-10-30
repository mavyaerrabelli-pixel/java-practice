package com.arrays;

public class SmallestNumber {

	public static void main(String[] args) {
		int[] array = { 12, 45, 7, 89, 23 };
		int smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}
		System.out.println("Smallest number :" + smallest);

	}

}
