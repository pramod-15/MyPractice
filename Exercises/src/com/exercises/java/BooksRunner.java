package com.exercises.java;

public class BooksRunner {
	public static void main(String[] args) {
		Books artOfComputerProgramming = new Books(100);
		Books effectiveJava = new Books(100);
		Books cleanCode = new Books(100);

//		artOfComputerProgramming.setNoOfCopies(90);
//		effectiveJava.setNoOfCopies(40);
//		cleanCode.setNoOfCopies(83);

		effectiveJava.increaseCopies(12);
		cleanCode.decreaseCopies(30);

		System.out.println("artOfComputerProgramming " + artOfComputerProgramming.getNoOfCopies());
		System.out.println("effectiveJava " + effectiveJava.getNoOfCopies());
		System.out.println("cleanCode " + cleanCode.getNoOfCopies());
	}
}
