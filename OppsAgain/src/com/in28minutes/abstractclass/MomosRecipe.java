package com.in28minutes.abstractclass;

public class MomosRecipe extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Bring momos powder");
	}

	@Override
	void prepareDish() {
		System.out.println("Prepare Momos");
	}

	@Override
	void cleanup() {
		System.out.println("Clean Momos utensils");
	}

}
