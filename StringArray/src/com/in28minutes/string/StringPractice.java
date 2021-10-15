package com.in28minutes.string;

public class StringPractice {
	@SuppressWarnings({ "unused", "removal" })
	public static void main(String[] args) {
		String str = "in28minutes";
		System.out.println(str.concat(" \"con\'cating\""));

		StringBuffer sf = new StringBuffer("Mutable");
		sf.append(" 123");
		System.out.println(sf);
		sf.setCharAt(0, '0');
		System.out.println(sf);
		System.out.println(sf);

		Integer in = Integer.valueOf(5);
		Character ch = new Character('a');
		Character ch1 = Character.valueOf('7');

		Float f = new Float(14.25f);
		Float f1 = Float.valueOf(74.458f);

		Short sh = new Short((short) 7);

		Short s = 12; // Autoboxing
		short sh1 = 14; // Primitive data type

		Integer seven = 7; // Autoboxing
		Integer sevenAgain = 7;

	}

}
