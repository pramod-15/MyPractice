package com.in28minutes.oopsAgain;

public class Review {

	private int rating;
	private String comment;
	private int id;

	public Review(int id, String comment, int rating) {
		this.id = id;
		this.comment = comment;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return String.format("ReviewID : %d Comments : %s Rating %d", id, comment, rating);
	}

}
