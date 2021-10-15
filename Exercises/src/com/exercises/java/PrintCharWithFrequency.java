package com.exercises.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintCharWithFrequency {

	public static void prCharWithFreq(String s) {

		Map<Character, Integer> d = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (d.containsKey(s.charAt(i))) {
				d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
			} else {
				d.put(s.charAt(i), 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {

			if (d.get(s.charAt(i)) != 0) {
				System.out.print(s.charAt(i) + ": ");
				System.out.print(d.get(s.charAt(i)) + " ");
				d.put(s.charAt(i), 0);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		prCharWithFreq(S);
	}
}
