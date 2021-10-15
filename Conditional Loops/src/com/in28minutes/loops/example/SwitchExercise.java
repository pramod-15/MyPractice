package com.in28minutes.loops.example;

public class SwitchExercise {

	public static void main(String[] args) {

		System.out.println(detemineNameOfDay(7));
	}

	private static String detemineNameOfDay(int choice) {

		switch (choice) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		default:
			return "None";
		}
	}

}
