package com.in28minutes.abstractclass;

public class AnimalRunner {
	public static void main(String[] args) {

		Animal[] animals = { new DogD(), new Cat() };

		for (Animal a : animals) {
			a.bark();
		}

	}
}
