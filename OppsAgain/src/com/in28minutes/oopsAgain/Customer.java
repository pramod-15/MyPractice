package com.in28minutes.oopsAgain;

public class Customer {

	// states, Properties

	private String name;

	private Address homeAddress;
	private Address workAddress;
	@SuppressWarnings("unused")
	private Address farmAddress;

	// creating

	public Customer(String name, Address homeAddress, Address workAddress) {

		this.name = name;
		this.homeAddress = homeAddress;
		this.workAddress = workAddress;
	}

	// operations

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {

		return String.format("Name [%s] Home Address [%s] Work Address [%s]", name, homeAddress, workAddress);
	}

}
