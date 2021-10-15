package com.primitivedatatype.exercise;

import java.math.BigDecimal;

public class SimpleIntrestCalculatorRunner {

	public static void main(String[] args) {
		String principal = "1000";
		String rate = "7.5";
		SimpleIntrestCalculator calculator = new SimpleIntrestCalculator(principal, rate);

		BigDecimal totalValue = calculator.totalAmount("2");

		System.out.println(totalValue);
	}

}
