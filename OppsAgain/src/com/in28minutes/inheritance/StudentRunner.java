package com.in28minutes.inheritance;

public class StudentRunner {

	public static void main(String[] args) {

		Student Shree = new Student("Shree");

		Shree.setEmail("Shree@reddif.com");
		Shree.setPhoneNumber("8754865425");
		Shree.setCollege("NPK");
		Shree.setYear(2);

		System.out.println(Shree);

	}
}