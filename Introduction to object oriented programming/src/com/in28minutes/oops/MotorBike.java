package com.in28minutes.oops;

public class MotorBike {
	private int speed;

	MotorBike(int speed) {
		this.speed = speed;
	}

	void start() {
		System.out.println("Bike Started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed = this.speed - howMuch);
	}

	void stop() {
		System.out.println("Bike Stopped");
	}

}
