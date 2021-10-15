package com.primitivedatatype.exercise;

import java.math.BigDecimal;

public class SimpleIntrestCalculator {

	BigDecimal principal;
	BigDecimal rate;
	BigDecimal timeSpan;
	BigDecimal totalAmount;

	SimpleIntrestCalculator(String principal, String rate) {
		this.principal = new BigDecimal(principal);
		this.rate = new BigDecimal(rate).divide(new BigDecimal(100));
	}

	public BigDecimal totalAmount(String timeSpan) {
		// totalAmount = principal + principal * rate * timeSpan
		totalAmount = principal.multiply(new BigDecimal(timeSpan)).multiply(rate).add(principal);
		return totalAmount;

	}

}
