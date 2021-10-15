package com.in28minutes.abstractclass;

public class ChickenRecipe extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Bring chicken");
	}

	@Override
	void prepareDish() {
		System.out.println("Boil chicken properly\nPrepare chicken curry");
	}

	@Override
	void cleanup() {
		System.out.println("Clean all utensils");
	}

}
