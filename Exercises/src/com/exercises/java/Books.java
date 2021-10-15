package com.exercises.java;

public class Books {
	private int noOfCopies;
	@SuppressWarnings("unused")
	private int pages;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	Books() {
		this(67);
	}

	Books(int noOfCopies, int pages) {
		this.noOfCopies = 210;
		this.pages = 1090;
	}

	Books(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies = this.noOfCopies + howMuch);
	}

	public void decreaseCopies(int howMuch) {
		this.noOfCopies = this.noOfCopies - howMuch;
	}

}
