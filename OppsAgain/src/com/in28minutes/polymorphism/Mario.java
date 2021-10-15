package com.in28minutes.polymorphism;

public class Mario implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Mario jump");

	}

	@Override
	public void down() {
		System.out.println("Mario lean");

	}

	@Override
	public void left() {
		System.out.println("Mario move back");

	}

	@Override
	public void right() {
		System.out.println("Mario move ahead");

	}

}
