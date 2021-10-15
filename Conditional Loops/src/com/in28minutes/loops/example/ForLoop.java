package com.in28minutes.loops.example;

public class ForLoop {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(1);
		System.out.println("is Prime " + number.isPrime());
		int sum = number.sumUptoN();
		System.out.println("sum " + sum);
		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("sum Of Divisors " + sumOfDivisors);
		number.printNumberTriangle();
	}

}
