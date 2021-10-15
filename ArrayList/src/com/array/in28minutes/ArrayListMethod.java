package com.array.in28minutes;

public class ArrayListMethod {

	public void marks() {
		int sum = 0;
		int[] marks = { 12, 13, 14, 12 };
		for (int mark : marks) {
			sum += mark;
		}
		System.out.println("Total marks are : " + sum);
	}

	public void marks8() {

		int[] marks = new int[8];
		marks[0] = 14;
		marks[1] = 13;
		marks[2] = 13;
		marks[3] = 12;
		marks[4] = 14;
		marks[5] = 11;
		marks[6] = 15;
		marks[7] = 13;

		for (int mark : marks) {
			System.out.println(mark);
		}

	}

}
