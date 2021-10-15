package com.in28minutes.interfaces;

public class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("With fuel");
	}

}
