
package com.in28minutes.oopsAgain;

public class FanRunner {

	public static void main(String[] args) {

		Fan crom = new Fan("Crompton", 0.3564, "White");

		crom.switchOn();
		crom.setSpeed((short) 5);

		String toStr = crom.toString();
		System.out.println(toStr);

	}

}
