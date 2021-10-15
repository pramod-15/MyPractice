package com.in28minutes.loops.example;

import java.util.Scanner;

public class WhileRunnerCube {

	public static void main(String[] args) {
		int number = 0;
		Scanner sc = new Scanner(System.in);

		while (number >= 0) {
			System.out.println("Enter number to check");
			number = sc.nextInt();
			if (number > 0) {
				System.out.println("Cube is " + number * number * number);
			}

		}
		System.out.println("Thank you! Have a fun");
		sc.close();
	}

}
