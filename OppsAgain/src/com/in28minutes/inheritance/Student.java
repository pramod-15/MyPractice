package com.in28minutes.inheritance;

//Is A relation, Student Is A Person. Whenever there is not Is A relation it is not recommended to use inheritance

public class Student extends Person {

	private String college;
	private int year;

	public Student(String name) {
		super(name);
		System.out.println("In Student Constructor");
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {

		return String.format(super.toString() + "\nCollege %s\nYear %d\n", college, year);
	}

}
