package com.array.in28minutes;

public class WeekDay {

	private String[] weekDays;

	public WeekDay(String[] weekDays) {
		this.weekDays = weekDays;
	}

	public String getLargCharDay() {

		String larg = weekDays[0];

		for (String str : weekDays) {

			if (larg.length() < str.length()) {
				larg = str;
			}

		}
		return larg;
	}

	public void printDaysBack() {
		for (int i = weekDays.length - 1; i >= 0; i--) {

			System.out.println(weekDays[i]);

		}
	}

}
