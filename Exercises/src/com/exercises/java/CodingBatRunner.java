package com.exercises.java;

public class CodingBatRunner {

	public static void main(String[] args) {

		CodingBat bat = new CodingBat();

		System.out.println("MissingChar : " + bat.missingChar("kitten", 1));

		System.out.println("FrontBack : " + bat.frontback("a"));

		System.out.println("front3 : " + bat.front3("abcd"));

		System.out.println("backAround : " + bat.backAround("run"));

		System.out.println("mod3or5 : " + bat.mod3or5(52));

		System.out.println("front22 : " + bat.front22("fronttwo"));

		System.out.println("startHi : " + bat.startHi("hi there!"));

		System.out.println("endUpr : " + bat.endUpr("hi"));

		System.out.println("EveryNth : " + bat.everyNth("ab3cd3ef3g", 3));
	}

}
