package com.exercises.java;

public class CodingBat {

	public String missingChar(String str, int n) {
		String substr = str.substring(0, n);
		return substr + str.substring(n + 1);
	}

	public String frontback(String str) {
		if (str.length() > 1) {
			String substr = str;
			char f = substr.charAt(0);
			char l = substr.charAt(substr.length() - 1);

			return l + str.substring(1, (str.length() - 1)) + f;
		} else {
			return str;
		}
	}

	public String front3(String str) {
		if (str.length() > 3) {
			String tripstr = str.substring(0, 3);
			return tripstr + tripstr + tripstr;
		} else {
			return str + str + str;
		}
	}

	public String backAround(String str) {
		char l = str.charAt(str.length() - 1);
		return l + str + l;
	}

	public boolean mod3or5(int i) {
		if (i % 3 == 0 || i % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public String front22(String str) {
		if (str.length() > 1) {
			String front2 = str.substring(0, 2);
			return front2 + str + front2;
		} else {
			return str + str + str;
		}
	}

	public boolean startHi(String str) {
		if (str.length() > 1) {
			String hi = str.substring(0, 2);
			if (hi.equals("hi")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public String endUpr(String str) {
		String result = "";
		String substr = "";
		if (str.length() <= 3) {
			result = str.toUpperCase();
		} else {
			substr = (str.substring(str.length() - 3, str.length()));
			result = str.substring(0, str.length() - 3) + substr.toUpperCase();
		}
		return result;
	}

	public String everyNth(String str, int i) {
		String result = "";

		for (int a = 0; a < str.length(); a++) {

			if (a != 0 && ((a + 1) % i) == 0) {
				result = result + str.charAt(a);
			}

		}
		return result;
	}

}