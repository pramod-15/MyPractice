package com.array.in28minutes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

//	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	int sum = 0;

	public Student(String name, int... marks) {
//		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	public int getNumberOfmarks() {
		return marks.size();
	}

	public int getSumOfMarks() {
		sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaxMarks() {

		return Collections.max(marks);
	}

	public int getMinMarks() {

		return Collections.min(marks);
	}

	public BigDecimal getAvgMarks() {

		int sum = (getSumOfMarks());
		int number = (getNumberOfmarks());
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

}
