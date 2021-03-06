package com.in28minutes.inheritance;

public class Person {

	private String name;
	private String phoneNumber;
	private String email;

	public Person(String name) {
		this.name = name;
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {

		return String.format("Name %s\nPhone Number %s\nEmail %s", name, phoneNumber, email);
	}
}
