package com.string.anagram;

public class Anagrams {

	public static void main(String[] args) {

		String a = "silent";
		String b = "listen";
		boolean isPresent = true;

//		by creating 2 arrays of 256 length

//		We can also check by simply creating 1 array of 256 length and subtracting the values from same array and checking is any non zero element is present or not.
		int[] al = new int[256];
		int[] bl = new int[256];

		for (char c : a.toCharArray()) {
			int index = c;
			al[index]++;
		}

		for (char c : b.toCharArray()) {
			int index = c;
			bl[index]++;
		}

		for (int i = 0; i < 256; i++) {

			if (al[i] != bl[i]) {
				isPresent = false;
				break;
			}
		}
//		____By using Selection
//		boolean[] visited = new boolean[b.length()];
//
//		if (a.length() == b.length()) {
//
//			for (int i = 0; i < a.length(); i++) {
//
//				char ch = a.charAt(i);
//				isPresent = false;
//
//				for (int j = 0; j < b.length(); j++) {
//
//					if (ch == b.charAt(j) && !visited[j]) {
//
//						visited[j] = true;
//						isPresent = true;
//						break;
//					}
//				}
//
//				if (!isPresent) {
//					System.out.println("Not an anagram");
//					break;
//				}
//			}
//		}
		if (isPresent) {
			System.out.println("Yes! Anagram");
		} else {
			System.out.println("No!");
		}
	}

}
