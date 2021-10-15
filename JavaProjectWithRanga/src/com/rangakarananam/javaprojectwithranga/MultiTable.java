package com.rangakarananam.javaprojectwithranga;
//Refactoring : Changing structure of code without changing functionability 

//of code

public class MultiTable {

	void print() {
		print(5);
	}

	void print(int n) {
		print(n, 1, 10);
	}

	void print(int n, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", n, i, n * i).println();
		}
	}

}
