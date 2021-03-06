package com.in28minutes.oopsAgain;

public class Fan {

	private String make;
	private double radius;
	private String color;

	private boolean isOn;
	private short speed;

	public Fan(String make, double rad, String color) {

		this.make = make;
		this.radius = rad;
		this.color = color;
	}

	@Override
	public String toString() {
		return String.format("Make - %s, Radius - %f, Color - %s, isOn - %b, Speed is %d", make, radius, color, isOn,
				speed);
	}

	public void switchOn() {
		isOn = true;
		speed = 3;
	}

	public void switchOff() {
		isOn = false;
		speed = 0;
	}

	public void setSpeed(short speed) {
		this.speed = speed;
	}

}
