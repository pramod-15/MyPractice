package com.in28minutes.oopsAgain;

public class CustomerRunner {

	public static void main(String[] args) {

		Address rohitHome = new Address("Near bus Stop", "Kolhapur", "416112");
		Address rohitWork = new Address("Kolhapur steel ltd", "Kolhapur", "416145");
		Address rohitFarm = new Address("Ambap Gavandar", "Ambap", "416112");

		Customer Rohit = new Customer("Rohit", rohitHome, rohitWork);

		System.out.println(Rohit);
		System.out.println("Farm Adress is : " + rohitFarm);

		Address rohitNewWork = new Address("Near Ganesh Temple", "Ambap", "416112");

		Rohit.setWorkAddress(rohitNewWork);

		System.out.println(Rohit);

	}

}
