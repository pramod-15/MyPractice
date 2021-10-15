package com.in28minutes.abstractclass;

public abstract class AbstractAnimal {

	public abstract void bark();

}

class Dog extends AbstractAnimal {

	@Override
	public void bark() {
		System.out.println("Bow bow");
	}

}
