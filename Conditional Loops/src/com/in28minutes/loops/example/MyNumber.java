package com.in28minutes.loops.example;

public class MyNumber {
	private int i;

	public MyNumber(int i) {
		this.i = i;
	}

	public boolean isPrime() {
		if (i < 2) {
			return false;
		}
		for (int j = 2; j < (i / 2) + 1; j++) {
			if (i % j == 0) {
				return false;

			}

		}
		return true;
	}

	public int sumUptoN() {
		int sum = 0;
		for (int j = 1; j <= i; j++) {
			sum = sum + j;
		}
		return sum;
	}

	public int sumOfDivisors() {
		int sumOfDivisors = 0;
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				sumOfDivisors = sumOfDivisors + j;
			}
		}
		return sumOfDivisors;
	}

	public void printNumberTriangle() {
		for (int j = 1; j <= i; j++) {
			for (int k = 1; k <= j; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
