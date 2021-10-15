package com.primitivedatatype.exercise;

public class BiNumberRunner {
	public static void main(String[] args) {

		BiNumber numbers = new BiNumber(12, 8);

		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.double1();
		System.out.println(numbers.getI());
		System.out.println(numbers.getJ());

	}

}
