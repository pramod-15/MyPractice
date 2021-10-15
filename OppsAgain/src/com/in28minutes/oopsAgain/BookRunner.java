package com.in28minutes.oopsAgain;

public class BookRunner {
	public static void main(String[] args) {

		Book Subtle = new Book(145, "Subtle", "Mark Manson");

		Subtle.addReview(new Review(10, "Great Book", 5));
		Subtle.addReview(new Review(11, "Nice Book", 4));
		Subtle.addReview(new Review(12, "Perfect Book", 5));

		System.out.println(Subtle);

	}
}
