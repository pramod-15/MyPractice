
package com.array.in28minutes;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		int marks[] = { 98, 98, 100 };
		Student student = new Student("Rahul", marks);

		int number = student.getNumberOfmarks();
		System.out.println("Subjects : " + number);

		int sum = student.getSumOfMarks();
		System.out.println("Sum : " + sum);

		int max = student.getMaxMarks();
		System.out.println("Max marks are : " + max);

		int min = student.getMinMarks();
		System.out.println("Min marks are :" + min);

		BigDecimal avg = student.getAvgMarks();
		System.out.println("Average marks are : " + avg);

	}
}
