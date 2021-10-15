package com.primitivedatatype.exercise;

public class CharacterRunner {
	public static void main(String[] args) {

		MyChar myChar = new MyChar('b');
		System.out.println("isAlphabet " + myChar.isAlphabet());
		System.out.println("isVowel " + myChar.isVowel());
		System.out.println("isConsonant " + myChar.isConsonant());
	}
}