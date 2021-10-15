package com.in28minutes.oopsAgain;

import java.util.ArrayList;

public class Book {

	private String title;
	private String author;
	private int id;
	private ArrayList<Review> reviews = new ArrayList<>();

	public Book(int id, String title, String author) {

		this.title = title;
		this.author = author;
		this.id = id;
	}

	public void addReview(Review views) {
		this.reviews.add(views);
	}

	@Override
	public String toString() {
		return String.format("Title : %s\nAuthor : %s\nRating : %d\nReviews : [%s]", title, author, id, reviews);
	}

}
