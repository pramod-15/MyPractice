package com.in28minutes.loops.example;

public class WhileNumber {

	private int limit;

	public WhileNumber(int limit) {
		this.limit = limit;
	}

	public void printSquaresUpto() {
		int sqrt = 1;
		while (limit > (sqrt * sqrt)) {
			System.out.println("square " + sqrt * sqrt);
			sqrt++;
		}
	}

	public void printCube() {
		int cubrt = 1;
		while (limit > (cubrt * cubrt * cubrt)) {
			System.out.println("Cube " + cubrt * cubrt * cubrt);
			cubrt++;
		}
	}

}
