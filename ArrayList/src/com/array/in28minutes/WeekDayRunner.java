package com.array.in28minutes;

public class WeekDayRunner {
	public static void main(String[] args) {

		String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		WeekDay day = new WeekDay(weekDays);
		String larg = day.getLargCharDay();
		System.out.println("Large char day : " + larg);

		System.out.println("Backward Days");
		day.printDaysBack();
	}
}
