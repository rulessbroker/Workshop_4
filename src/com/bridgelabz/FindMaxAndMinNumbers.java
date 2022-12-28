package com.bridgelabz;

public class FindMaxAndMinNumbers {
	public static void main(String[] args) {
		int rollNumbers[] = { 43, 98, 23, 19 };

		System.out.println("Original Array");
		for (int i = 0; i < rollNumbers.length; i++) {
			System.out.print(rollNumbers[i] + " ");
		}
		System.out.println();
		FindMaxAndMinNumbers result = new FindMaxAndMinNumbers();
		System.out.println("\nSecond Largest Number : ");
		result.secondLargestNum(rollNumbers);

		System.out.println("\nSecond Smallest Number");
		result.secondSmallestNum(rollNumbers);

	}

	public void secondLargestNum(int array[]) {
		int max = 1;
		int secondMax = 0;
		for (int i = 0; i < array.length; i++) {
			int getValue = array[i];
			if (max == 1) {
				max = getValue;
				secondMax = array[1];
			} else {
				if (max < getValue) {
					secondMax = max;
					max = getValue;
				} else if (secondMax < getValue) {
					secondMax = getValue;
				}
			}
		}
		System.out.println("" + secondMax);
	}

	public void secondSmallestNum(int array[]) {
		int min = 1;
		int secondMin = 0;
		for (int i = 0; i < array.length; i++) {
			int getValue = array[i];
			if (min == 1) {
				min = getValue;
				secondMin = array[1];
			} else {
				if (min > getValue) {
					secondMin = min;
					min = getValue;
				} else if (secondMin > getValue) {
					secondMin = getValue;
				}
			}
		}
		System.out.println("" + secondMin);
	}
}
