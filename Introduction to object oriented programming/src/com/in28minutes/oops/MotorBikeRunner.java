package com.in28minutes.oops;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(90);
		MotorBike honda = new MotorBike(80);

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		honda.setSpeed(120);

		ducati.decreaseSpeed(100);
		honda.increaseSpeed(20);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
	}

}
