package com.in28minutes.polymorphism;

public class GamingConsoleRunner {

	public static void main(String[] args) {

		GamingConsole[] games = { new Mario(), new Chess() };

		for (GamingConsole game : games) {

			game.up();
			game.down();
			game.right();
			game.left();
		}

	}
}