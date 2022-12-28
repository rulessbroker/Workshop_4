package com.bridgelabz;

public class CountSum {
	public static void main(String[] args) {
		int numbers[] = { 2, 4, 5, 1, 3, 3, 7, -1};
		int sum = 0;
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				sum = numbers[i] + numbers[j];

				if (sum == 6) {
					count++;
				}
			}
		}
		System.out.println(count);

	}
}
