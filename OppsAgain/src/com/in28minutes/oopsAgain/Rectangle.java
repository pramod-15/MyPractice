package com.in28minutes.oopsAgain;

public class Rectangle {
	private int width;
	private int length;

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public int area() {
		return width * length;
	}

	public int perimeter() {
		return 2 * (length + width);
	}

	@Override
	public String toString() {
		return String.format("Length - %d, Width - %d, Area - %d, Perimeter - %d", length, width, area(), perimeter());
	}

//	public int getWidth() {
//		return width;
//	}

	public void setWidth(int width) {
		this.width = width;
	}

//	public int getLength() {
//		return length;
//	}

	public void setLength(int length) {
		this.length = length;
	}

}
