package com.primitivedatatype.exercise;

public class BiNumber {
	private int i;
	private int j;

	BiNumber(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	int add() {
		return i + j;
	}

	int multiply() {
		return i * j;
	}

	void double1() {
		this.i = 2 * i;
		this.j = 2 * j;

	}

}
