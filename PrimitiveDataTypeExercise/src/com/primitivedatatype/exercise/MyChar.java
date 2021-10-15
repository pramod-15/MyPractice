package com.primitivedatatype.exercise;

public class MyChar {
	char ch;

	public MyChar(char c) {
		this.ch = c;
	}

	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {

			return true;
		} else {
			return false;
		}
	}

	public boolean isVowel() {
		ch = Character.toLowerCase(ch);
		if (isAlphabet() && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {

			return true;
		} else {
			return false;
		}
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel()) {
			return true;
		} else {
			return false;
		}
	}

}
